import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created with IntelliJ IDEA.
 * User: Umut Ozan Yıldırım
 * Date: 01/02/14
 * Time: 16:26
 */
public class DaoGenerator {

    /*
        Change the version and default package
        You can add new methods like "addEntity" method below to create other tables
        Make sure to call the created methods inside the main method to create the table ( addEntity(schema) )
        Run the program, your model objects will be located under gen folder
     */

    public static void main(String [] args) throws Exception{
        int version = 1;
        String defaultPackage = "com.myapp.models";

        Schema schema = new Schema(1 , defaultPackage);
        addEntity(schema);

        new de.greenrobot.daogenerator.DaoGenerator().generateAll(schema , "./src/main/gen");
    }

    private static void addEntity(Schema schema) {
        Entity demoEntity = schema.addEntity("DemoEntity");

        demoEntity.addIdProperty();
        demoEntity.addStringProperty("name");
    }

}
