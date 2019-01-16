package util;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author： 月在未央
 * @date： 2019/1/14 12:25
 */
public class ReadYML {

    public static Map<String,Object> commands;
    public static Map<String,String> describes;

    public static void read(){
        Yaml yaml = new Yaml();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(ReadYML.class.getClassLoader().getResourceAsStream("config.yml")));
            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line = br.readLine()) != null){
                buffer.append("\n");
                buffer.append(line);
            }
            String input = new String(buffer.toString().getBytes(),"utf-8");
            LinkedHashMap<String,Object>  map = yaml.load(input);
            commands = (Map<String, Object>) map.get("Command");
            describes =  (Map<String, String>) map.get("Desc");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
