import com.alibaba.fastjson.JSONObject;

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
        map.put("code", "1");
        map.put("msg", "");
        map.put("data", "{\"invoiceNo\":\"MS9267552\"}}");
//        System.out.println(map);
        if ("1".equals(map.get("code").toString())) {
            success = true;
        }
        String jsonStr = "{\"code\":\"1\",\"data\":{\"id\":12620,\"utype\":1,\"password\":\"d8578edf8458ce06fbc5bb76a58c5ca4\",\"token\":\"3a359b87da764461af439713f99aa132\",\"mobile\":\"18758107325\",\"realname\":\"马淦\",\"sexcode\":1,\"birthdate\":\"1994-10-15 00:00:00\",\"flag\":1,\"lastlogdate\":\"2018-10-14 20:48:04\",\"lastlogip\":\"127.0.0.1\",\"regip\":\"\",\"regdate\":\"2018-08-20 09:35:11\",\"regtype\":1,\"cardtype\":\"1\",\"idcard\":\"330683199410153239\",\"activated\":0,\"openid\":\"osewI0j1ARllfkvgoQucgMTptQL8\",\"patientcode\":\"9332789,6654946,10069069,10081803\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"滨江区\",\"address\":\"创业\",\"certificationValidityPeriod\":\"1\",\"outpatientCardNo\":\"801953675113\",\"outpatientCardId\":\"411\"}}";
        JSONObject json = JSONObject.parseObject(jsonStr);
        if (json.getString("code").equals("1")) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
