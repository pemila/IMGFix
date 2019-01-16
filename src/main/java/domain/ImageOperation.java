package domain;

import lombok.Data;

/**
 * @author： 月在未央
 * @date： 2019/1/16 16:00
 */
@Data
public class ImageOperation {
    private int length;
    private int width;
    private String format;
    private String url;
}
