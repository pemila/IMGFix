package util;

import domain.ImageOperation;
import net.coobird.thumbnailator.Thumbnails;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 缩放
 * @author： 月在未央
 * @date： 2019/1/16 15:54
 */
public class Zoom {
    public static void ZoomBySizeAuto(ImageOperation imo) {
        File file = new File(imo.getUrl());
        try {
            String path =  file.getParent()+"/re/";
            File dir = new File(path);
            dir.mkdir();
            Thumbnails.of(file).size(imo.getWidth(),imo.getLength()).toFile(path+file.getName());
            System.out.println(file.getName()+"已完成");
        } catch (IOException e) {
            System.out.println(file.getName()+"操作失败");
        }
    }
}
