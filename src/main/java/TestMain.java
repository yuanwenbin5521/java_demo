import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TestMain {
    public static void main(String[] args) throws Exception {
        URL url=new URL("http://www.12306.cn");
        URLConnection connection=url.openConnection();
        connection.connect();
        BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String str=null;
        while ((str=reader.readLine())!=null){
            System.out.println(str);
        }
        reader.close();
    }
}
