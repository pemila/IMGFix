package com.pemila.util;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author： 月在未央
 * @date： 2019/1/14 12:25
 */
public class ReadYML {
    public static Map<String,Object> read(){
        Yaml yaml = new Yaml();
        URL url = ReadYML.class.getClassLoader().getResource("config.yml");
        LinkedHashMap<String,Object> map = null;
        try {
            map = yaml.load(new FileInputStream(url.getFile()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return map;
    }
}
