
import util.ReadYML;

import java.util.Scanner;

/**
 * @author： 月在未央
 * @date： 2019/1/16 14:23
 */
public class Run {
    public static void main(String[] args) {
        //加载配置文件
        ReadYML.read();
        //初始化
        Invoker invoker = new Invoker();
        invoker.excuteCommand("init");
        Scanner in = new Scanner(System.in);
        while (true){
            String command = in.next();
            switch (command){
                case "quit":
                    System.out.println("bye!");
                    return;
                case "help":
                case "z":
                    invoker.excuteCommand(command);
                    break;
                default:
                    System.out.println("无效命令");
            }
        }
    }
}
