/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author asus
 */
public class Function {
    static String folder = ".kelasB";
    static String home = System.getProperty("user.home");
    static String pathFolder = home + File.separator + folder;
    static String logFile = "Log.txt";
    static String pathLog = pathFolder + File.separator + logFile;

    public static void logActivity(String activity) {
        try {
            System.out.println(pathFolder);
            File folder = new File(pathFolder);
            folder.mkdir();

            File fileLog = new File(pathLog);
            if (!fileLog.exists()) {
                fileLog.createNewFile();
            }

            Files.write(
                    Paths.get(pathLog),
                    activity.getBytes(),
                    StandardOpenOption.APPEND);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
