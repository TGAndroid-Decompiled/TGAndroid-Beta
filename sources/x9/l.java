package x9;

import org.json.JSONObject;
public abstract class l {
    public static final k2.e f46049a;

    static {
        ka.d dVar = new ka.d();
        a aVar = a.f46021a;
        dVar.m(l.class, aVar);
        dVar.m(b.class, aVar);
        f46049a = new k2.e(dVar, 1);
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
