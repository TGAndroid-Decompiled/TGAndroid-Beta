package w7;

import java.util.Date;
import org.json.JSONObject;
public abstract class a8 {
    public static lf.h a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a2 = s8.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(s8.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, s8.a(jSONObject2.optString("name")), s8.a(jSONObject2.optString("address_line1")), s8.a(jSONObject2.optString("address_line2")), s8.a(jSONObject2.optString("address_city")), s8.a(jSONObject2.optString("address_state")), s8.a(jSONObject2.optString("address_zip")), s8.a(jSONObject2.optString("address_country")), u8.a(s8.a(jSONObject2.optString("brand"))), s8.a(jSONObject2.optString("last4")), s8.a(jSONObject2.optString("fingerprint")), u8.b(s8.a(jSONObject2.optString("funding"))), s8.a(jSONObject2.optString("country")), s8.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new lf.h(a2, valueOf, aVar, str2);
    }
}
