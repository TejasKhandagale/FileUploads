package videoplayer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaPlayer.Status;
import javafx.stage.Screen;


public class Videoplayer extends Application {

    Duration start_time = Duration.ZERO;
    Duration initial = Duration.ZERO;
    Duration curr_time;
    Duration end_time;
    Duration totalTime;
    int sec_start;
    int sec_end;
    int sec_total;
    private boolean playing = false;
    String text = "";

    ArrayList<DurationWithLabel> annotation = new ArrayList<DurationWithLabel>();
    TreeView treeView = new TreeView();
    TextField str_tm = new TextField();
    TextField ed_tm = new TextField();

    public boolean flagVisualization = false;
 
    @Override
    public void start(Stage stage) throws Exception {
        GetArray abc = new GetArray();
        // String arr[][]= abc.create_arr();
        //GetArray abc = new GetArray();
        //String arr[][] = abc.read();
        //GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        // final double rem = javafx.scene.text.Font.getDefault().getSize();
        //final double rem1 = Math.rint(new Text("").getLayoutBounds().getHeight());
        //System.out.println(rem);
        //System.out.println(rem1);

        //int width = gd.getDisplayMode().getWidth();
        //int height = gd.getDisplayMode().getHeight();
        double width = visualBounds.getWidth();
        double height = visualBounds.getHeight();


        System.out.println(width);
        System.out.println(height);
        final Canvas canvas = new Canvas(width * 0.78, 50);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        stage.setTitle("Data Annotation");
        Group firstScene = new Group();

        Button fileOpener = new Button("Open Video");

        Button set_start = new Button("Set Time");
        Button set_end = new Button("Set Time");
        
        set_start.setDisable(true);
        set_end.setDisable(true);

        firstScene.getChildren().addAll(fileOpener);
        FileChooser fileChooser = new FileChooser();
        fileOpener.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    flagVisualization = false;

                    Group sceneGroup = new Group();
                    File file = fileChooser.showOpenDialog(stage);
                    //String arr[][] = abc.read(file.getParent(), file.getName());
                    annotation = abc.read1(file.getParent(), file.getName());

                    // sceneGroup.getChildren().remove(fileOpener);
                    if (file != null) {
                        String fileLink = file.toURI().toString();
                        // System.out.println(file.getParentFile());
//                        try {
                        Media media = new Media(fileLink);
                        // StackPane sp= new StackPane();
                        // naya_wala.getChildren().remove(sp);
                        //naya_wala.getChildren().add(sp);
                        MediaPlayer mediaPlayer = new MediaPlayer(media);

                        MediaView mediaView = new MediaView(mediaPlayer);

                        mediaPlayer.setOnReady(new Runnable() {
                            @Override
                            public void run() {

                                if (media.getWidth() < width * 0.78) {
                                    mediaView.setX(((width * 0.78) - media.getWidth()) / 2);
                                }

                                mediaView.setFitWidth(width * 0.78);
                                mediaView.setFitHeight(height * 0.78);
                                mediaView.setPreserveRatio(true);
                                // mediaView.setY(10.0);
                                // mediaView.setX(150.0);
                                int w = mediaPlayer.getMedia().getWidth();
                                int h = mediaPlayer.getMedia().getHeight();
                                //System.out.println(h);
                                //System.out.println(w);
                                final Slider video_slider = new Slider();
                                video_slider.setTranslateY(height * 0.78 - 50);
                                video_slider.setMinWidth(width * 0.78);
                                video_slider.setMinHeight(10);
                                video_slider.setMax(mediaPlayer.getTotalDuration().toSeconds());
                                sceneGroup.getChildren().add(video_slider);
                                HBox hbox = new HBox();

                                canvas.setTranslateY(height * 0.85);
                                GraphicsContext gc = canvas.getGraphicsContext2D();
                                gc.setFill(javafx.scene.paint.Color.GRAY);
                                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
                                
                                
                                
								// Play/pause Button icons
								Image playButtonImage = new Image(
										"file:src/media/play.png");
								Image stopButtonImage = new Image(
										"file:src/media/stop.png");
								Image forwardButtonImage = new Image(
										"file:src/media/forward.png");
								Image rewindButtonImage = new Image(
										"file:src/media/rewind.png");
								Image pauseButtonImage = new Image(
										"file:src/media/pause.png");

								ImageView iv1 = new ImageView(playButtonImage);
								ImageView iv2 = new ImageView(stopButtonImage);
								ImageView iv3 = new ImageView(forwardButtonImage);
								ImageView iv4 = new ImageView(rewindButtonImage);
								ImageView iv5 = new ImageView(pauseButtonImage);

								iv1.setFitHeight(30);
								iv1.setFitWidth(30);
								iv2.setFitHeight(30);
								iv2.setFitWidth(30);
								iv3.setFitHeight(30);
								iv3.setFitWidth(30);
								iv4.setFitHeight(30);
								iv4.setFitWidth(30);
								iv5.setFitHeight(30);
								iv5.setFitWidth(30);

								

                                Button play_btn = new Button();
                                Button stop_btn = new Button();
                                Button fast_btn = new Button();
                                Button slow_btn = new Button();
                                Button pause_btn = new Button();
                                Slider volumeSlider = new Slider();
                                Label time_label = new Label();
                                
                             // Setting button icons
                                play_btn.setGraphic(iv1);
								stop_btn.setGraphic(iv2);
								fast_btn.setGraphic(iv3);
								slow_btn.setGraphic(iv4);
								pause_btn.setGraphic(iv5);
                                //  labell.setTranslateX(1200);
                                //labell.setTranslateY(850);

                                hbox.getChildren().addAll(play_btn, stop_btn, fast_btn, slow_btn, volumeSlider);
                                //m.getChildren().addAll(hbox);

                                hbox.setSpacing(40.0);
                                time_label.setTranslateX(width * 0.73);
                                time_label.setTranslateY(height * 0.78);

                                hbox.setTranslateY(height * 0.78);
                                hbox.setTranslateX(width * 0.26);
                                sceneGroup.getChildren().addAll(hbox, time_label);
                                sceneGroup.getChildren().add(canvas);

                                totalTime = mediaPlayer.getTotalDuration();
                                for (int i = 0; i < annotation.size(); i++) {
                                    DurationWithLabel data = annotation.get(i);
                                    System.out.println(data.label.getClass());
                                    double start_line;
                                    double end_line;
                                    double sec_start = data.startingTime.toSeconds();
                                    double sec_end = data.endingTime.toSeconds();
                                    double sec_total = totalTime.toSeconds();

                                    start_line = (sec_start * canvas.getWidth()) / sec_total;
                                    end_line = (sec_end * canvas.getWidth()) / sec_total;
                                    gc.setFill(data.paint);
                                    gc.fillRect(start_line, 0, end_line - start_line, canvas.getHeight());
                                }

                                mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
                                    @Override
                                    public void changed(ObservableValue<? extends Duration> observable, Duration oldValue, Duration newValue) {
                                        video_slider.setValue(newValue.toSeconds());
                                        totalTime = mediaPlayer.getTotalDuration();
                                        time_label.setText(abc.updateTime(newValue, totalTime));

                                    }
                                });

                                play_btn.setOnAction(new EventHandler<ActionEvent>() {
                                    @Override
                                    public void handle(ActionEvent event) {
                                        flagVisualization = false;
                                        playing = !playing;
                                        if (playing) {
                                            //play_btn.setText("Pause");
                                        	play_btn.setGraphic(iv5);
                                            mediaPlayer.play();
                                        } else {
                                            //play_btn.setText("Play   ");
                                        	play_btn.setGraphic(iv1);
                                            mediaPlayer.pause();
                                        }

                                        if (mediaPlayer.getStatus().equals(Status.PLAYING)) {

                                            set_start.setDisable(false);
                                            set_end.setDisable(false);
                                        }
                                        if (mediaPlayer.getStatus().equals(Status.PAUSED)) {
                                            set_start.setDisable(true);
                                            set_end.setDisable(true);
                                        }
                                    }
                                });

                                stop_btn.setOnAction(new EventHandler<ActionEvent>() {
                                    @Override
                                    public void handle(ActionEvent event) {
                                        mediaPlayer.stop();
                                    }
                                });
                                
                                slow_btn.setOnAction(new EventHandler<ActionEvent>() {
                                    @Override
                                    public void handle(ActionEvent event) {
                                        mediaPlayer.setRate(mediaPlayer.getRate() * 0.5);
                                    }
                                });
                                fast_btn.setOnAction(new EventHandler<ActionEvent>() {
                                    @Override
                                    public void handle(ActionEvent event) {
                                        mediaPlayer.setRate(mediaPlayer.getRate() * 2);
                                    }
                                });

                                volumeSlider.setValue(mediaPlayer.getVolume() * 100);

                                volumeSlider.valueProperty().addListener(new InvalidationListener() {
                                    @Override
                                    public void invalidated(Observable observable) {
                                        mediaPlayer.setVolume(volumeSlider.getValue() / 100);
                                    }
                                });

                                video_slider.setOnMouseClicked(new EventHandler<MouseEvent>() {
                                    @Override
                                    public void handle(MouseEvent mouseEvent) {
                                        mediaPlayer.seek(Duration.seconds(video_slider.getValue()));
                                    }
                                });

                                //System.out.println(h);
                                //System.out.println(w);
                                stage.setMinHeight(h);
                                stage.setMinWidth(w);
                            }
                        });
                        // mediaPlayer.play();
                        // screen.getChildren().addAll(mediaView);
                        sceneGroup.getChildren().add(mediaView);

                        TreeViewHelper helper = new TreeViewHelper();
                        ArrayList<TreeItem> labels = helper.getLabels();

                        treeView.setMinSize(width * 0.1822, height * 0.55);
                        TreeItem rootItem = new TreeItem("Labels");
                        rootItem.getChildren().addAll(labels);
                        //rootItem.setExpanded(true);
                        treeView.setRoot(rootItem);

                        canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent event) {
                                double canvas_point = event.getSceneX();

                                double total_seconds = totalTime.toSeconds();

                                Duration end = Duration.ZERO;
                                Duration start = Duration.ZERO;
                                double label_dur = canvas_point * total_seconds / canvas.getWidth();
                                //System.out.println(label_dur + " Annotation size: " + annotation.size());

                                for (int i = 0; i < annotation.size(); i++) {
                                    DurationWithLabel data = annotation.get(i);
                                    //String text = data.label;
                                    double start_time = data.startingTime.toSeconds();
                                    double end_time = data.endingTime.toSeconds();
                                    //   System.out.println("start:" + start_time + " end:" + end_time);
                                    if (label_dur >= start_time && label_dur <= end_time) {
                                        text = data.label;
                                        start = data.startingTime;
                                        end = data.endingTime;
                                        flagVisualization = true;
                                        break;
                                    }
                                }
                                // System.out.println("Text:" + text);

                                if (text != "") {
                                    TreeItem item = (helper.getTreeViewItem(rootItem, text));
                                    if (item != null) {
                                        treeView.getSelectionModel().select(item);
                                        str_tm.setText(abc.textbox_time(start));
                                        ed_tm.setText(abc.textbox_time(end));

                                    }
                                }
// 

                            }
                        });

                        HBox start = new HBox();
                        HBox end = new HBox();

                        Label str = new Label("Enter start time:   ");

                        str_tm.setEditable(false);

                        Label ed = new Label("Enter end time:    ");

                        ed_tm.setEditable(false);

                        set_start.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                start_time = mediaPlayer.getCurrentTime();
                                str_tm.setText(abc.textbox_time(start_time));
                                flagVisualization = false;
                            }
                        });

                        set_end.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                end_time = mediaPlayer.getCurrentTime();
                                ed_tm.setText(abc.textbox_time(end_time));
                                flagVisualization = false;
                            }
                        });

                        start.getChildren().addAll(str, str_tm, set_start);
                        end.getChildren().addAll(ed, ed_tm, set_end);

                        Button save = new Button("Save Current Label");
                        VBox vbox_1 = new VBox();
                        vbox_1.setTranslateX((width * 0.78) + 30);
                        vbox_1.getChildren().add(treeView);
                        vbox_1.getChildren().addAll(start, end);

                        str_tm.setText(abc.textbox_time(initial));
                        str_tm.setOnMouseClicked(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent mouseEvent) {
                                if (mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
                                    if (mouseEvent.getClickCount() == 2) {
                                        //start_time = mediaPlayer.getCurrentTime();
                                        //str_tm.setText(abc.textbox_time(start_time));
                                        /// Check if the starting time and the ending time are valid

                                        /// If valid, then saved
                                    }
                                }
                            }
                        });

                        ed_tm.setOnMouseClicked(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent mouseEvent) {
                                if (mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
                                    if (mouseEvent.getClickCount() == 2) {
                                        //str_tm.setText();
                                        //end_time = mediaPlayer.getCurrentTime();
                                        //ed_tm.setText(abc.textbox_time(end_time));
                                    }
                                }
                            }
                        });
//                        
//                        for (Object child : rootItem.getChildren()) 
//                        {
//                            String s= child.toString();
//                            String[] ss= s.split("'");
//                            System.out.println(ss[1]);
//                                        
//                        }
                        rootItem.setExpanded(true);
                        // treeView.getSelectionModel().select(rootItem.nextSibling());

                        treeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
                            @Override
                            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                                TreeItem<Label> selectedItem = (TreeItem<Label>) newValue;

                                save.setOnAction(new EventHandler<ActionEvent>() {
                                    @Override
                                    public void handle(ActionEvent event) {
                                        if (flagVisualization == true) {
                                            System.out.println(text);
                                            for (int i = 0; i < annotation.size(); i++) {

                                                DurationWithLabel data = annotation.get(i);
                                                double start_line;
                                                double end_line;
                                                double sec_start = data.startingTime.toSeconds();
                                                double sec_end = data.endingTime.toSeconds();

                                                System.out.println("start:" + sec_start);
                                                System.out.println("end:" + sec_end);

                                                int somethinghere = GetArray.textbox_time1(str_tm.getText());//start time box
                                                int somethingthere = GetArray.textbox_time1(ed_tm.getText()); //end time box
                                                if ((int) sec_start == somethinghere && (int) sec_end == somethingthere) {
                                                    String s = selectedItem.getValue().toString();
                                                    String[] ss = s.split("'");
                                                    //data.label = selectedItem.toString();

                                                    //System.out.println("Done");
                                                    String str = "";
                                                    if (ss.length > 1) {
                                                        str = ss[1];
                                                    } else {
                                                        str = ss[0];
                                                    }
                                                    if (str != "") {
                                                        data.label = str;
                                                        System.out.println(str);
                                                        double sec_total = totalTime.toSeconds();
                                                        data.paint = selectedItem.getValue().getTextFill();

                                                        start_line = (sec_start * canvas.getWidth()) / sec_total;
                                                        end_line = (sec_end * canvas.getWidth()) / sec_total;
                                                        gc.setFill(data.paint);
                                                        gc.fillRect(start_line, 0, end_line - start_line, canvas.getHeight());
                                                    }
                                                }
                                            }
                                            flagVisualization = false;

                                        } else if (selectedItem.isLeaf() & !ed_tm.getText().equals("") & !str_tm.getText().equals("")) {

                                            str_tm.setText(abc.textbox_time(end_time));
                                            ed_tm.setText("");

                                            Label text = selectedItem.getValue();
                                            annotation.add(new DurationWithLabel(start_time, end_time, text.getText(), text.getTextFill()));
                                            start_time = end_time;
                                            for (int i = 0; i < annotation.size(); i++) {

                                                DurationWithLabel data = annotation.get(i);
                                                double start_line;
                                                double end_line;
                                                double sec_start = data.startingTime.toSeconds();
                                                double sec_end = data.endingTime.toSeconds();
                                                double sec_total = totalTime.toSeconds();

                                                start_line = (sec_start * canvas.getWidth()) / sec_total;
                                                end_line = (sec_end * canvas.getWidth()) / sec_total;
                                                gc.setFill(data.paint);
                                                gc.fillRect(start_line, 0, end_line - start_line, canvas.getHeight());
                                            }
                                        }
                                    }
                                });
                            }
                        });
                        Button exit = new Button("Exit");
                        exit.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                Platform.exit();
                            }

                        });

                        Button save_all = new Button("Save To File");
                        vbox_1.getChildren().addAll(save, save_all, fileOpener, exit);

                        save_all.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {

                                try {
                                    abc.write(annotation, file.getParent(), file.getName());
                                    flagVisualization = false;
                                } catch (IOException ex) {
                                    Logger.getLogger(Videoplayer.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }

                        });

                        sceneGroup.getChildren().add(vbox_1);
                        //  System.out.println(sceneGroup.getChildren());
                        Scene mainscene1 = new Scene(sceneGroup, 300, 400);
                        // mainscene1.setFill(Color.BLACK);
                        stage.setScene(mainscene1);
                        stage.setFullScreen(true);
                        stage.show();
                        //mainscene1.getStylesheets().add(getClass().getResource("mytree.css").toExternalForm());

                    }
                } catch (IOException ex) {
                    Logger.getLogger(Videoplayer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        // stage.setFullScreen(true);
        Scene mainscene = new Scene(firstScene,300, 400);
        System.out.println(mainscene.getWidth());
        System.out.println(mainscene.getHeight());
        stage.setScene(mainscene);
        // stage.setFullScreen(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
