package x9;

import org.json.JSONObject;
public abstract class l {
    public static final a4.l f51221a;

    static {
        ka.d dVar = new ka.d();
        a aVar = a.f51190a;
        dVar.a(l.class, aVar);
        dVar.a(b.class, aVar);
        f51221a = new a4.l(dVar, 26);
    }

    public static b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j3 = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new b(string, string2, string3, string4, j3);
    }
}
