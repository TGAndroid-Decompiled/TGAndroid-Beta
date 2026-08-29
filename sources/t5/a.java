package t5;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s5.b;
public abstract class a {
    public static final b f48158a = new b("MetadataUtils", null);
    public static final String[] f48159b;
    public static final String f48160c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f48159b = strArr;
        f48160c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    public static java.util.Calendar a(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: t5.a.a(java.lang.String):java.util.Calendar");
    }

    public static JSONArray b(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y5.a aVar = (y5.a) it.next();
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", aVar.f50494b.toString());
                jSONObject.put("width", aVar.f50495c);
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
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    list.add(new y5.a(jSONArray.getJSONObject(i10)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
