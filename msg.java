import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class msg {

        public static void main(String[] args) throws AWTException, InterruptedException {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the msg");
            String msg=sc.nextLine();
            System.out.println("how many times you want to send the msg");
            int size=sc.nextInt();

            StringSelection StringSelection=new StringSelection(msg);
            Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(StringSelection,null);

            Thread.sleep(3000);
            Robot robot=new Robot();
            for (int i=1;i<=size;i++)
            {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);

                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);

                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
                Thread.sleep(1000);
                System.out.println();
            }



        }
    }


