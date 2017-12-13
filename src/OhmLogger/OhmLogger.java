package OhmLogger;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OhmLogger
{

    private static Logger lg = null; // statisches Klassenelemnt, existiert für die Klasse, nicht nur für die Objekte

    private OhmLogger()
    {
    }

    public static Logger getLogger() //statische Methode, weil es kein Objekt der Klasse gibt
    {
        if (lg == null)
        {
            lg = Logger.getLogger("OhmLogger");
            try
            {
                initLogger();
            }
            catch (IOException ex)
            {
                Logger.getLogger(OhmLogger.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lg;
    }

    private static void initLogger() throws IOException // statische Klassenmethode, weil es kein Objekt der Klasse gibt
    {

        Properties props = new Properties();

        try
        {
            InputStream is = OhmLogger.class.getResourceAsStream("config/logger.properties");
            props.load(is);
            String level = props.getProperty("LOG_LEVEL");
            String dateiname = props.getProperty("LOG_DATEI");
            //String dateipfad = props.getProperty("LOG_DATEI_PFAD");
            String datei = System.getProperty("user.dir") + File.separator + dateiname; // File C:,users,<username>,AppData,Local,Temp
            //String datei = dateipfad + File.separator + dateiname;

            Handler filehandler = new FileHandler(datei, true);
            //Handler filehandler = new ConsoleHandler();
            lg.addHandler(filehandler);

            Level lev = Level.parse(level);
            lg.setLevel(lev);

            Formatter myFormatter = new OhmFormatter();

            filehandler.setFormatter(myFormatter);
        }
        catch (NullPointerException ex)
        {
            System.out.println("Logger: Initalisierungsfehler\n");
        }

    }
}
