package OhmLogger;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class OhmFormatter extends SimpleFormatter
{
  public OhmFormatter()
  {

  }
  
  /**
   * Methode zur Formatierung eines LogRecord in Wunschformat
   * Wunschformat: | Zeitstempel | Level | Klasse (=Quelle der Meldung) | Meldung|
   * @param record
   * @return String mit formatiertem Record
   */
  @Override
  public String format(LogRecord record)
  {
    long zeitstempel = record.getMillis(); // Zeitstempel in Millisekunden seit 1970
    
    Date time = new Date(zeitstempel); // Datum aus Zeitstempel generieren 
    Calendar calendar = new GregorianCalendar();
    calendar.setTime(time);
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1;
    int day = calendar.get(Calendar.DAY_OF_MONTH);
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    
    // andere entscheidende Daten aus LogRecord record extrahieren
    Level level = record.getLevel();
    String klasse = record.getSourceClassName();
    String methode = record.getSourceMethodName();
    String meldung = record.getMessage();
    
    // String zusammenbauen zur Logmessage
    
    String logMessage ="| " + year + "/" + month + "/" + day + " " + hour + ":" + minute + ":" + second + " | " + level.toString() + " | " + klasse + " " + methode + " | " + meldung +"\n";
    
    return logMessage;
  }
}
