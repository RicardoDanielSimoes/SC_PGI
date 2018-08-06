/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GPI;

import ch.rs.logiceditor.controller.master.ApplicationInitialization;
import ch.rs.logiceditor.model.controller.LogicBlockAdapter;
import ch.rs.logiceditor.model.controller.LogicHolder;
import ch.rs.logiceditor.model.master.LogicBlock;
import ch.rs.logiceditor.model.master.LogicPanel;
import ch.rs.logiceditor.model.util.ClassData;
import ch.rs.logiceditor.model.util.ClassDataSerializer;
import ch.rs.logiceditor.view.master.GuiHolder;
<<<<<<< HEAD:src/GPI/Main.java
import ch.rs.logiceditor.view.master.loader.LoadingApplication;
import ch.rs.logiceditor.view.util.ApplicationProperties;
import ch.rs.reflectorgrid.ReflectorGrid;
=======
import ch.rs.reflectorgrid.*;
>>>>>>> 16dbfd3cd34de533a25ff92cf3e202fda43377a1:src/main/java/GPI/Main.java
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Ricardo
 */
public class Main extends Application {

    static LogicHolder holder = new LogicHolder();
    static GridPane grid = new GridPane();
    static ReflectorGrid rgrid = new ReflectorGrid();
//    static Variable var = new Variable("Zeitkonstante", true);
    static List<Class<? extends LogicBlock>> classes = new LinkedList<>();
    static GuiHolder gui;
    static LoadingApplication loading;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
<<<<<<< HEAD:src/GPI/Main.java
        //    loadFile();

=======
>>>>>>> 16dbfd3cd34de533a25ff92cf3e202fda43377a1:src/main/java/GPI/Main.java
        launch(args);
    }

    public static void createFile(){


        LogicHolder holder = new LogicHolder();
        LogicPanel panel = new LogicPanel();
        panel.setName("testPanel");
        holder.addPanel(panel);
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(ClassData.class,
                new ClassDataSerializer()
        );
        Gson gson = gsonBuilder.excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
        System.out.println(gson.toJson(holder));
        holder.startLogicHolder();
        rgrid.setNodeWidthLimit(100);
//        grid = rgrid.transfromIntoGrid(tcpIn);
    }

    public static void loadFile() throws FileNotFoundException {

        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.registerTypeAdapter(ClassData.class,
                new ClassDataSerializer()
        );
        gsonBuilder.registerTypeAdapter(LogicBlock.class, new LogicBlockAdapter());
        Gson gson = gsonBuilder.excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Ricardo\\Documents\\GitHub\\SC_PGI\\src\\GPI\\savefile.json"));
        holder = gson.fromJson(reader, LogicHolder.class);

    }


    @Override
    public void start(Stage primaryStage) throws Exception {
<<<<<<< HEAD:src/GPI/Main.java
        try {
            loading = new LoadingApplication(10);
            loading.start(new Stage());
        } catch ( Exception e){
            System.out.println("Error right here at the start man " + e.getMessage());
            System.exit(-1);
        }


        BlockLoader loader = new BlockLoader();
        try{
            loading.setLoadingText("Loading block jars");
            classes = loader.getBlocks();
            loading.incrementProgress();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        loading.setLoadingText("Checking for properties....");
        System.out.println(System.getProperty("user.home"));
        ApplicationProperties prop = new ApplicationProperties();
        prop.getProperties();

        loading.incrementProgress();

        loading.setLoadingText("Creating SaveFile...");
        createFile();
        loading.incrementProgress();
        loading.setLoadingText("Launching...");
        //      holder.startLogicHolder();
//        OR or = new OR();
        LinkedList<LogicBlock> blocks = new LinkedList<>();
        LogicHolder logicHolder = new LogicHolder();
        loading.setLoadingText("Finished! Cleanup...");
        //gui = new GuiHolder(logicHolder);
        //gui.start(primaryStage);
        //gui.setGridPane(grid);
        //gui.initializeBlockList(classes);
=======
        new ApplicationInitialization().initialize(primaryStage);
>>>>>>> 16dbfd3cd34de533a25ff92cf3e202fda43377a1:src/main/java/GPI/Main.java
    }

}