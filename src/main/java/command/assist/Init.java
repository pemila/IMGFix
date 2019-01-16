package command.assist;

import command.ICommand;

/**
 * @author： 月在未央
 * @date： 2019/1/16 15:28
 */
public class Init implements ICommand {
    @Override
    public void excute() {
        System.out.println();
        System.out.println("#### ##     ##  ######   ######## #### ##      ##");
        System.out.println(" ##  ###   ### ##    ##  ##        ##   ##   ##");
        System.out.println(" ##  #### #### ##        ##        ##    ## ##");
        System.out.println(" ##  ## ### ## ##   #### ######    ##     ###");
        System.out.println(" ##  ##     ## ##    ##  ##        ##    ## ##");
        System.out.println(" ##  ##     ## ##    ##  ##        ##   ##   ##");
        System.out.println("#### ##     ##  ######   ##       #### ##     ##");
        System.out.println();
        System.out.println("如需帮助请输入：help");
    }
}
