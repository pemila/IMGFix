package command;

import command.assist.ICommand;
import util.ReadYML;

import java.util.Map;
import java.util.Set;

/**
 * @author： 月在未央
 * @date： 2019/1/16 15:06
 */
public class Help implements ICommand {
    @Override
    public void excute() {
        Set<Map.Entry<String, String>> entrySet = ReadYML.describes.entrySet();
        for(Map.Entry<String,String> en: entrySet){
            System.out.println(en.getKey()+":"+en.getValue());
        }
    }
}
