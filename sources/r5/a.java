package r5;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q5.b;
public abstract class a {
    public static final b f47075a = new b("MetadataUtils", null);
    public static final String[] f47076b;
    public static final String f47077c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f47076b = strArr;
        f47077c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    public static java.util.Calendar a(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: r5.a.a(java.lang.String):java.util.Calendar");
    }

    public static JSONArray b(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w5.a aVar = (w5.a) it.next();
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", aVar.f48764b.toString());
                jSONObject.put("width", aVar.f48765c);
                jSONObject.put("height", aVar.d);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static void c(List list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                try {
                    list.add(new w5.a(jSONArray.getJSONObject(i9)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
