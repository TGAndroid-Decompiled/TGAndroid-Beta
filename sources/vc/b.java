package vc;

import ee.v;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Cells.r6;
import tc.g;
import w7.q8;
public abstract class b {
    public static final c f43305a = new c();

    public static HttpURLConnection a(String str, v vVar) {
        Throwable th2;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.stripe.com/v1/tokens").openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(80000);
        httpURLConnection.setUseCaches(false);
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Charset", "UTF-8");
        hashMap.put("Accept", "application/json");
        hashMap.put("User-Agent", "Stripe/v1 JavaBindings/3.5.0");
        String str2 = vVar.f7502b;
        hashMap.put("Authorization", "Bearer " + str2);
        String[] strArr = {"os.name", "os.version", "os.arch", "java.version", "java.vendor", "java.vm.version", "java.vm.vendor"};
        HashMap hashMap2 = new HashMap();
        for (int i10 = 0; i10 < 7; i10++) {
            String str3 = strArr[i10];
            hashMap2.put(str3, System.getProperty(str3));
        }
        hashMap2.put("bindings.version", "3.5.0");
        hashMap2.put("lang", "Java");
        hashMap2.put("publisher", "Stripe");
        hashMap.put("X-Stripe-Client-User-Agent", new JSONObject(hashMap2).toString());
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (httpURLConnection instanceof HttpsURLConnection) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(f43305a);
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        try {
            outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(str.getBytes("UTF-8"));
                outputStream.close();
                return httpURLConnection;
            } catch (Throwable th3) {
                th2 = th3;
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            outputStream = null;
        }
    }

    public static String b(HashMap hashMap) {
        String encode;
        String encode2;
        StringBuilder sb2 = new StringBuilder();
        for (a aVar : d(null, hashMap)) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            String str = aVar.f43303a;
            String str2 = aVar.f43304b;
            if (str == null) {
                encode = null;
            } else {
                encode = URLEncoder.encode(str, "UTF-8");
            }
            if (str2 == null) {
                encode2 = null;
            } else {
                encode2 = URLEncoder.encode(str2, "UTF-8");
            }
            sb2.append(encode + "=" + encode2);
        }
        return sb2.toString();
    }

    public static m.e3 c(java.util.HashMap r7, ee.v r8) {
        throw new UnsupportedOperationException("Method not decompiled: vc.b.c(java.util.HashMap, ee.v):m.e3");
    }

    public static LinkedList d(String str, Map map) {
        LinkedList linkedList = new LinkedList();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (str != null) {
                    str2 = str + "[" + str2 + "]";
                }
                linkedList.addAll(e(value, str2));
            }
        }
        return linkedList;
    }

    public static List e(Object obj, String str) {
        if (obj instanceof Map) {
            return d(str, (Map) obj);
        }
        if (obj instanceof List) {
            List<Object> list = (List) obj;
            LinkedList linkedList = new LinkedList();
            String t10 = r6.t(str, "[]");
            if (list.isEmpty()) {
                linkedList.add(new a(str, ""));
                return linkedList;
            }
            for (Object obj2 : list) {
                linkedList.addAll(e(obj2, t10));
            }
            return linkedList;
        } else if (!"".equals(obj)) {
            if (obj == null) {
                LinkedList linkedList2 = new LinkedList();
                linkedList2.add(new a(str, ""));
                return linkedList2;
            }
            LinkedList linkedList3 = new LinkedList();
            linkedList3.add(new a(str, obj.toString()));
            return linkedList3;
        } else {
            throw new g(r6.j("You cannot set '", str, "' to an empty string. We interpret empty strings as null in requests. You may set '", str, "' to null to delete the property."), null, null);
        }
    }

    public static a5.a f(java.util.HashMap r7, ee.v r8) {
        throw new UnsupportedOperationException("Method not decompiled: vc.b.f(java.util.HashMap, ee.v):a5.a");
    }

    public static void g(int i10, String str, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("error");
            q8.a(jSONObject.optString("charge"));
            q8.a(jSONObject.optString("code"));
            q8.a(jSONObject.optString("decline_code"));
            str3 = q8.a(jSONObject.optString("message"));
            q8.a(jSONObject.optString("param"));
            q8.a(jSONObject.optString("type"));
        } catch (JSONException unused) {
            str3 = "An improperly formatted error response was found.";
        }
        if (i10 != 429) {
            switch (i10) {
                case 400:
                    throw new g(str3, str2, null);
                case 401:
                    throw new g(str3, str2);
                case 402:
                    throw new g(str3, str2, null);
                case 403:
                    throw new g(str3, str2);
                case 404:
                    throw new g(str3, str2, null);
                default:
                    throw new g(str3, str2, null);
            }
        }
        throw new g(str3, str2, null);
    }
}
