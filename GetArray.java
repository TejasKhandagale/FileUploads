/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoplayer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import videoplayer.DurationWithLabel;


public class GetArray {

    public String[][] create_arr() {
        String arr[][] = {{"Open Application", "0:00:00", "0:00:00"},
        {"Create New Post", "0:00:00", "0:00:00"},
        {"Search", "0:00:00", "0:00:00"},
        {"Forward", "0:00:00", "0:00:00"},
        {"Backward", "0:00:00", "0:00:00"},
        {"Preview", "0:00:00", "0:00:00"},
        {"Discard", "0:00:00", "0:00:00"},
        {"Select", "0:00:00", "0:00:00"},
        {"Add", "0:00:00", "0:00:00"},
        {"Delete", "0:00:00", "0:00:00"},
        {"Move Cursor", "0:00:00", "0:00:00"},
        {"Capture Photo", "0:00:00", "0:00:00"},
        {"Capture Video", "0:00:00", "0:00:00"},
        {"Crop Photo", "0:00:00", "0:00:00"},
        {"Post", "0:00:00", "0:00:00"},
        {"Copy", "0:00:00", "0:00:00"},
        {"Paste", "0:00:00", "0:00:00"},
        {"Switch Application", "0:00:00", "0:00:00"},
        {"Receive Notification", "0:00:00", "0:00:00"},
        {"Ignore Notification", "0:00:00", "0:00:00"},
        {"Close Application", "0:00:00", "0:00:00"},
        {"Add Text", "0:00:00", "0:00:00"},
        {"Delete Text", "0:00:00", "0:00:00"},
        {"Replace Text", "0:00:00", "0:00:00"},
        {"Text", "0:00:00", "0:00:00"},
        {"Photo", "0:00:00", "0:00:00"},
        {"Video", "0:00:00", "0:00:00"},
        {"Audio", "0:00:00", "0:00:00"},
        {"Understanding task - Adequate", "0:00:00", "0:00:00"},
        {"Understanding task - Inadequate", "0:00:00", "0:00:00"},
        {"Understanding genre - Adequate", "0:00:00", "0:00:00"},
        {"Understanding genre - Inadequate", "0:00:00", "0:00:00"},
        {"Knowing Topic - Adequate", "0:00:00", "0:00:00"},
        {"Knowing Topic - Inadequate", "0:00:00", "0:00:00"},
        {"Building Represenetation of Task", "0:00:00", "0:00:00"},
        {"Linking Goal and Sub-Goal", "0:00:00", "0:00:00"},
        {"Devising Plan", "0:00:00", "0:00:00"},
        {"Integrating Goals and Plans", "0:00:00", "0:00:00"},
        {"Setting Intension", "0:00:00", "0:00:00"},
        {"Monitoring Progress on Goals", "0:00:00", "0:00:00"},
        {"Consolidating Plan", "0:00:00", "0:00:00"},
        {"Using a Pointer Word", "0:00:00", "0:00:00"},
        {"Creating a How-to", "0:00:00", "0:00:00"},
        {"Resolving Conflict", "0:00:00", "0:00:00"},
        {"Invoking Pre-Text", "0:00:00", "0:00:00"},
        {"Describing Pre-Text", "0:00:00", "0:00:00"},
        {"Evaluating Pre-Text", "0:00:00", "0:00:00"},
        {"Revising Pre-Text", "0:00:00", "0:00:00"},
        {"Producing text from Pre-Text", "0:00:00", "0:00:00"},
        {"Evaluating Pre-Text to Text Produced So Far", "0:00:00", "0:00:00"},
        {"Translating a Content Problem", "0:00:00", "0:00:00"},
        {"Translating a Rhetorical Problem", "0:00:00", "0:00:00"},
        {"Change to Text", "0:00:00", "0:00:00"},
        {"Change to Plan", "0:00:00", "0:00:00"},
        {"No Change", "0:00:00", "0:00:00"},
        {"Spelling", "0:00:00", "0:00:00"},
        {"Tense", "0:00:00", "0:00:00"},
        {"Number", "0:00:00", "0:00:00"},
        {"Modality", "0:00:00", "0:00:00"},
        {"Abbreviation", "0:00:00", "0:00:00"},
        {"Punctuation", "0:00:00", "0:00:00"},
        {"Format", "0:00:00", "0:00:00"},
        {"Preserving Meaning Change - Addition", "0:00:00", "0:00:00"},
        {"Preserving Meaning Change - Deletion", "0:00:00", "0:00:00"},
        {"Preserving Meaning Change - Substitution", "0:00:00", "0:00:00"},
        {"Preserving Meaning Change - Permutation", "0:00:00", "0:00:00"},
        {"Preserving Meaning Change - Distribution", "0:00:00", "0:00:00"},
        {"Preserving Meaning Change - Consolidation", "0:00:00", "0:00:00"},
        {"Micro-Structural Change - Addition", "0:00:00", "0:00:00"},
        {"Micro-Structural Change - Deletion", "0:00:00", "0:00:00"},
        {"Micro-Structural Change - Substitution", "0:00:00", "0:00:00"},
        {"Micro-Structural Change - Permutation", "0:00:00", "0:00:00"},
        {"Micro-Structural Change - Distribution", "0:00:00", "0:00:00"},
        {"Micro-Structural Change - Consolidation", "0:00:00", "0:00:00"},
        {"Macro-Structural Change - Addition", "0:00:00", "0:00:00"},
        {"Macro-Structural Change - Deletion", "0:00:00", "0:00:00"},
        {"Macro-Structural Change - Substitution", "0:00:00", "0:00:00"},
        {"Macro-Structural Change - Permutation", "0:00:00", "0:00:00"},
        {"Macro-Structural Change - Distribution", "0:00:00", "0:00:00"},
        {"Macro-Structural Change - Consolidation", "0:00:00", "0:00:00"},
        {"Selecting mode", "0:00:00", "0:00:00"},
        {"Arranging order", "0:00:00", "0:00:00"},
        {"Word-Specific", "0:00:00", "0:00:00"},
        {"Image-Specific", "0:00:00", "0:00:00"},
        {"Duo-Specific", "0:00:00", "0:00:00"},
        {"Word-AdditiveImage-Additive", "0:00:00", "0:00:00"},
        {"Parallel Combination", "0:00:00", "0:00:00"},
        {"Montage Combination", "0:00:00", "0:00:00"},
        {"Interdependent Combination", "0:00:00", "0:00:00"},
        {"Temporal", "0:00:00", "0:00:00"},
        {"Sequential", "0:00:00", "0:00:00"},
        {"Hierarchical", "0:00:00", "0:00:00"},
        {"Topical", "0:00:00", "0:00:00"},
        {"Task-Oriented", "0:00:00", "0:00:00"},
        {"Geographical", "0:00:00", "0:00:00"},};
        return arr;
    }

    public static void write(ArrayList<DurationWithLabel> x, String filepath, String media_file) throws IOException {

        String directoryName = filepath + "//Label//";
        File directory = new File(directoryName);
        if (!directory.exists()) {
            directory.mkdir();
        }
        media_file = media_file.substring(0, media_file.length() - 4);

        filepath = directoryName + media_file + "_label.lab";
        FileWriter fw = new FileWriter(filepath);
        BufferedWriter buffer = new BufferedWriter(fw);
        for (int i = 0; i < x.size(); i++) {
            DurationWithLabel data = x.get(i);
            buffer.write(data.startingTime + "@" + data.endingTime + "@" + data.label + "@" + data.paint + "\n");
        }
        buffer.close();
    }

    public static ArrayList<DurationWithLabel> read1(String parent_file_path, String media_file) throws IOException {
        media_file = media_file.substring(0, media_file.length() - 4);
        String filename = parent_file_path + "\\Label\\" + media_file + "_label.lab";
        System.out.println(filename);
        //System.out.println(filename);
        //String
        String line;
        GetArray abc = new GetArray();
        ArrayList<DurationWithLabel> x = new ArrayList<DurationWithLabel>();

        int i = 0;
        try {
            BufferedReader input = new BufferedReader(new FileReader(filename));
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {

                Duration s = Duration.ZERO;
                Duration e = Duration.ZERO;
                String arr[] = line.split("@");
                s = Duration.valueOf(arr[0].replaceAll("\\s+", ""));
                e = Duration.valueOf(arr[1].replaceAll("\\s+", ""));
                Color c= Color.web(arr[3]);
                DurationWithLabel data = new DurationWithLabel(s, e, arr[2], c);
                x.add(data);
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return x;
    }

    public static String[][] read(String parent_file_path, String media_file) throws IOException {
        //System.out.println(file);
        media_file = media_file.substring(0, media_file.length() - 4);

        String filename = parent_file_path + "\\Label\\" + media_file + "_label.lab";
        System.out.println(filename);
        //System.out.println(filename);
        //String
        String line;
        GetArray abc = new GetArray();
        String[][] x = new String[95][3];
        int i = 0;
        try {
            BufferedReader input = new BufferedReader(new FileReader(filename));
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {
                x[i] = line.split("@");
                i++;
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e);
            x = abc.create_arr();
        }
        return x;
    }

    public static String updateTime(Duration elapsed, Duration duration) {
        int intElapsed = (int) Math.floor(elapsed.toSeconds());
        int elapsedHours = intElapsed / (60 * 60);
        if (elapsedHours > 0) {
            intElapsed -= elapsedHours * 60 * 60;
        }
        int elapsedMinutes = intElapsed / 60;
        int elapsedSeconds = intElapsed - elapsedHours * 60 * 60
                - elapsedMinutes * 60;

        if (duration.greaterThan(Duration.ZERO)) {
            int intDuration = (int) Math.floor(duration.toSeconds());
            int durationHours = intDuration / (60 * 60);
            if (durationHours > 0) {
                intDuration -= durationHours * 60 * 60;
            }
            int durationMinutes = intDuration / 60;
            int durationSeconds = intDuration - durationHours * 60 * 60
                    - durationMinutes * 60;
            if (durationHours > 0) {
                return String.format("%d:%02d:%02d/%d:%02d:%02d",
                        elapsedHours, elapsedMinutes, elapsedSeconds,
                        durationHours, durationMinutes, durationSeconds);
            } else {
                return String.format("%02d:%02d/%02d:%02d",
                        elapsedMinutes, elapsedSeconds, durationMinutes,
                        durationSeconds);
            }
        } else {
            if (elapsedHours > 0) {
                return String.format("%d:%02d:%02d", elapsedHours,
                        elapsedMinutes, elapsedSeconds);
            } else {
                return String.format("%02d:%02d", elapsedMinutes,
                        elapsedSeconds);
            }
        }
    }

    public static String textbox_time(Duration elapsed) {
        int intElapsed = (int) Math.floor(elapsed.toSeconds());
        int elapsedHours = intElapsed / (60 * 60);
        if (elapsedHours > 0) {
            intElapsed -= elapsedHours * 60 * 60;
        }
        int elapsedMinutes = intElapsed / 60;
        int elapsedSeconds = intElapsed - elapsedHours * 60 * 60
                - elapsedMinutes * 60;
        return String.format("%d:%02d:%02d", elapsedHours, elapsedMinutes, elapsedSeconds);

    }

    public static int textbox_time1(String time) {
        String[] arr=time.split(":");
        if(arr.length == 3)
            return Integer.parseInt(arr[0]) * 3600 + Integer.parseInt(arr[1]) * 60 + Integer.parseInt(arr[2]);
        return -1;
    }
}
