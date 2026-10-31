package y9;

import org.json.JSONObject;
public abstract class l {
    public static final a4.l f54347a;

    static {
        la.d dVar = new la.d();
        a aVar = a.f54319a;
        dVar.e(l.class, aVar);
        dVar.e(b.class, aVar);
        f54347a = new a4.l(dVar, 26);
    }

    public static b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j10 = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new b(string, string2, string3, string4, j10);
    }
}
