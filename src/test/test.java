import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lcn_louis
 * @Date: 2018/10/29 2:24 PM
 */
public class test {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        boolean success = false;
        map.put("code", -1);
        map.put("msg", "");
        map.put("data", "{\"invoiceNo\":\"MS9267552\"}}");
        System.out.println(map);
        if ("1".equals(map.get("code").toString())) {
            success = true;
        }
        System.out.println(success);
    }
}
