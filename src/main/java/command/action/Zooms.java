package command.action;

import command.ICommand;
import domain.ImageOperation;
import net.coobird.thumbnailator.filters.Watermark;
import util.Zoom;

import java.io.File;
import java.util.Scanner;

/**
 * @author： 月在未央
 * @date： 2019/1/16 16:18
 */
public class Zooms implements ICommand {

    private ImageOperation imo;

    @Override
    public void excute() {

        try {
            imo = new ImageOperation();
            Scanner in = new Scanner(System.in);
/*        System.out.println("命令方式请输入1，交互方式请输入2");
        switch (in.next()){
            case "0":
                System.out.print(">");
                String command = in.next();
            case "1":

        }*/
            System.out.print("文件路径>");
            String url = in.next();
            System.out.println("缩放后大小>");
            System.out.print("格式：宽，高>");
            String[] wl = in.next().split(",");
            imo.setWidth(Integer.parseInt(wl[0]));
            imo.setLength(Integer.parseInt(wl[1]));
            File f = new File(url);
            if (f.isDirectory()) {
                String[] urls = f.list();
                for (int i = 0; i < urls.length; i++) {
                    imo.setUrl(url+"/"+urls[i]);
                    Zoom.ZoomBySizeAuto(imo);
                }
            }else{
                imo.setUrl(url);
                Zoom.ZoomBySizeAuto(imo);
            }
            System.out.println("命令执行完毕！");
        } catch (Exception e) {

        }
    }
}
