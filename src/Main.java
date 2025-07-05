import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args){
//        testeExcepion();
        System.out.println("antes do runtime");
        try{
            testeRunTimeExceprion();
        } catch (RuntimeException e) {
            log.warning("erro de runtime " +e);
        }
        lancarRunTimeExceprion();

        System.out.println("valor");
    }

    public static void testeExcepion(){
        try{
            FileOutputStream stream = new FileOutputStream("");
        }catch (Exception e){
            log.info("testeboy "+e);

        }
    }
//    perceba que nem gera warns
    public static void testeRunTimeExceprion(){
        throw new RuntimeException("erro");
    }

    //laçara aritmetic exception
    public static void lancarRunTimeExceprion(){
        float div = 10/0;
        System.out.println(div);
    }

}