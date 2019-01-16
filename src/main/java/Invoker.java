
import command.ICommand;
import util.ReadYML;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author： 月在未央
 * @date： 2019/1/14 12:18
 */
public class Invoker {
    private List<ICommand> commands =new ArrayList<>();
    private void addCommand(ICommand command){
        commands.add(command);
    }
    //执行命令
    public void excuteCommand(String command){
        initComm(command);
        commands.forEach(ICommand::excute);
        commands = new ArrayList<>();
    }
    /** 获取命令应该执行的方法*/
    private void initComm(String command){
        Map<String, Object> map = ReadYML.commands;
        Object inter  = map.get(command.toLowerCase());
        List<String> aa = new ArrayList<>();
        if(inter instanceof String){
            aa.add((String) inter);
        }else{
            aa = (List<String>)inter;
        }
        for(String a :aa){
            try {
                Class clazz = Invoker.class.getClassLoader().loadClass(a);
                addCommand((ICommand) clazz.newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
