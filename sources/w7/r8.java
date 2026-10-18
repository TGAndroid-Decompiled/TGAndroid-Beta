package w7;

import java.util.Date;
import org.json.JSONObject;
public abstract class r8 {
    public static t0.h a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a2 = n9.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(n9.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        wc.a aVar = new wc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, n9.a(jSONObject2.optString("name")), n9.a(jSONObject2.optString("address_line1")), n9.a(jSONObject2.optString("address_line2")), n9.a(jSONObject2.optString("address_city")), n9.a(jSONObject2.optString("address_state")), n9.a(jSONObject2.optString("address_zip")), n9.a(jSONObject2.optString("address_country")), p9.a(n9.a(jSONObject2.optString("brand"))), n9.a(jSONObject2.optString("last4")), n9.a(jSONObject2.optString("fingerprint")), p9.b(n9.a(jSONObject2.optString("funding"))), n9.a(jSONObject2.optString("country")), n9.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new t0.h(a2, valueOf, aVar, str2);
    }
}
