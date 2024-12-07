//package src.main.resources.org.example.mediterraneanseaihm;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//
//public class MainIHM extends Application {
//    @Override
//    public void start(Stage primaryStage) {
//        MediterraneanBackground background = new MediterraneanBackground();
//        HeadCount headCount = new HeadCount();
//        UpdateNews updateNews = new UpdateNews();
//
//        StackPane root = new StackPane();
//        root.getChildren().addAll(background, headCount, updateNews);
//
//        Scene scene = new Scene(root, 800, 600);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("JavaFX UI");
//        primaryStage.show();
//
//        // Example of updating information
//        headCount.updateCount(42);
//        updateNews.updateNews("New species discovered!");
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}