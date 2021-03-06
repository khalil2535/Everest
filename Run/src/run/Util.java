package run;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JOptionPane;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Util {

    private static final String JUST_PASTE_IT_URL = "https://justpaste.it/4l27h";
    private static final String EVEREST_PATH = "C:\\Everest\\";
    private static final String EVEREST_JAR_PATH = EVEREST_PATH + "Everest.jar";
    private static final String EVEREST_VERSION_PATH = EVEREST_PATH + "Version";

    public static void prerun_check() throws Exception {
        if (isInternetConnected()) {
            if (!isLastRelease()) {
                if (JOptionPane.showConfirmDialog(null, "Everest has new version, do you want "
                        + "to Download it ?") == JOptionPane.YES_OPTION) {
                    updateJar();
                }
            }
        }
    }

    private static void updateJar() throws IOException {
        String lastVersionUrlToEnd;
        String versionNmbr;
        {
            String page = getHTML(JUST_PASTE_IT_URL);
            String allVersions = page.substring(
                    page.indexOf("Everest Program"), page.indexOf("End Versions!"));
            String lastVersionToEnd = allVersions.substring(allVersions.indexOf("lastVersion"));
            String lastVersion = lastVersionToEnd.substring(0, lastVersionToEnd.indexOf("]"));
            lastVersionUrlToEnd = lastVersion.substring(lastVersion.indexOf("https"));
            String preVersion = lastVersionToEnd.substring(lastVersionToEnd.indexOf("version : "));
            versionNmbr = preVersion.substring(10, preVersion.indexOf("}"));
        }
        new Thread(() -> {
            try {
                downloadRun(lastVersionUrlToEnd);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }).start();
        while (!downloadEverest(lastVersionUrlToEnd)) {
        }
        writeFile(EVEREST_VERSION_PATH, versionNmbr);
    }

    private static boolean downloadEverest(String lastVersionUrlToEnd)
            throws IOException, MalformedURLException {
        String jarLink;
        try {
            jarLink = lastVersionUrlToEnd.substring(0, lastVersionUrlToEnd.indexOf("}"));
        } catch (Exception ex)// Not just IO
        {
            System.out.println(ex);
            return false;
        }
        File jarDist = new File(EVEREST_JAR_PATH);
        jarDist.getParentFile().mkdir();
        saveUrl(jarDist.toString(), jarLink, true);
        return true;
    }

    private static boolean downloadRun(String lastVersionUrlToEnd)
            throws IOException, MalformedURLException {
        String runLink;
        try {
            String temp = lastVersionUrlToEnd.substring(lastVersionUrlToEnd.indexOf("run:") + 4);
            runLink = temp.substring(0, temp.indexOf("}"));
        } catch (Exception ex) {
            System.out.println(ex);
            return true;
        }
        File runDist = new File("C:\\Everest\\Run.jar");
        runDist.getParentFile().mkdir();
        saveUrl(runDist.toString(), runLink, true);
        return true;
    }

    private static boolean isLastRelease() throws IOException {
        String page = getHTML(JUST_PASTE_IT_URL);
        String allVersions = page.substring(
                page.indexOf("Everest Program"), page.indexOf("End Versions!"));
        return allVersions.contains("Last Version : " + getEverestVersion());
    }

    private static boolean isInternetConnected() {
        try {
            final URL url = new URL("https://www.facebook.com");
            final URLConnection urlConn = url.openConnection();
            urlConn.connect();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }

    public static String getHTML(String urlToRead) throws IOException {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();
        httpUrlConn.setRequestMethod("GET");
        httpUrlConn.setRequestProperty("User-Agent", "Mozilla/5.0");
        try (BufferedReader rd = new BufferedReader(new InputStreamReader(httpUrlConn.getInputStream()))) {
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }

    public static DisplayProgressBar displayProgressBar(String title, String labelTxt,
            UpdateProgressBarOperation upbo) {
        // title = Everest Updater
        // labelTxt = Downloading File ..
        DisplayProgressBar frame = new DisplayProgressBar(title, labelTxt, upbo);
        frame.setVisible(true);
        return frame;
    }

    public static abstract interface UpdateProgressBarOperation {

        /**
         * @param progressBar
         * @param progressBarLabel
         * @return true to close or false to not close
         */
        abstract boolean updateBar(JProgressBar progressBar, JLabel progressBarLabel);
    }

    public static double getEverestVersion() throws NumberFormatException {
        try {
            return Double.parseDouble(readFile(EVEREST_VERSION_PATH));
        } catch (IOException ex) {
            return -1;
        }
    }

    public static boolean saveUrl(String filename, String urlString)
            throws MalformedURLException, IOException {
        return saveUrl(filename, urlString, false);
    }

    public static boolean saveUrl(String filename, String urlString, boolean gui_mode)
            throws MalformedURLException, IOException {
        Download download = new Download(new URL(urlString), new File(filename));
        if (gui_mode) {
            DisplayProgressBar frame = displayProgressBar("Everest Downloader",
                    "Downloading File (" + new File(filename).getName() + ") ..",
                    (progressBar, progressBarLbl) -> {
                        try {
                            Thread.currentThread().sleep(1_000);
                        } catch (InterruptedException ex) {
                            System.out.println(ex);
                        }
                        switch (download.getStatus()) {
                            case 2:
                                progressBar.setValue(100);
                                progressBarLbl.setText("Done (100%)");
                                JOptionPane.showMessageDialog(null, "Download Completed");
                                return true;
                            case 3:
                                progressBarLbl.setText("Download Cancelled");
                                JOptionPane.showMessageDialog(null, "Download Cancelled");
                                return true;
                            case 4:
                                progressBarLbl.setText("Download Error");
                                JOptionPane.showMessageDialog(null, "Download Error");
                                return true;
                            default:
                                progressBar.setValue((int) download.getProgress());
                                progressBarLbl.setText(
                                        (download.getProgress() + "00000").substring(0, 5) + "%");
                                return false;
                        }
                    });
            while (true) {
                try {
                    Thread.currentThread().sleep(1_000);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                switch (frame.jLabel2.getText()) {
                    case "Done (100%)":
                        return true;
                    case "Download Cancelled":
                        return false;
                    case "Download Error":
                        return false;
                }
            }
        }
        return false;
    }

    public static String readFile(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, "UTF-8");
    }

    public static void writeFile(String file, String text) throws IOException {
        byte ptext[] = text.getBytes();
        text = new String(ptext, "UTF-8");
        try (PrintWriter out = new PrintWriter(file)) {
            out.println(text);
        }
    }
}
