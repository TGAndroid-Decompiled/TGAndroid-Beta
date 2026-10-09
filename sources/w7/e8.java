package w7;

import java.util.Date;
import org.json.JSONObject;
public abstract class e8 {
    public static v7.k a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a2 = x8.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(x8.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        vc.a aVar = new vc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, x8.a(jSONObject2.optString("name")), x8.a(jSONObject2.optString("address_line1")), x8.a(jSONObject2.optString("address_line2")), x8.a(jSONObject2.optString("address_city")), x8.a(jSONObject2.optString("address_state")), x8.a(jSONObject2.optString("address_zip")), x8.a(jSONObject2.optString("address_country")), z8.a(x8.a(jSONObject2.optString("brand"))), x8.a(jSONObject2.optString("last4")), x8.a(jSONObject2.optString("fingerprint")), z8.b(x8.a(jSONObject2.optString("funding"))), x8.a(jSONObject2.optString("country")), x8.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new v7.k(a2, valueOf, aVar, str2);
    }
}
