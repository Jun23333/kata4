
package control;

import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuild;
import view.MailListReader;


public class Kata4 {


    public static void main(String[] args) {
        
        String fileName = new String("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Kata4\\email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuild.build(mailList);
        HistogramDisplay histDisplay = new HistogramDisplay(histogram);
        histDisplay.excute();
    }
    
}
