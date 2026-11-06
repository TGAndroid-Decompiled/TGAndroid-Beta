package sa;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
public final class b implements Callable {
    public final int f54893a;
    public final c f54894b;

    public b(c cVar, int i7) {
        this.f54893a = i7;
        this.f54894b = cVar;
    }

    private final Object a() {
        String byteArrayOutputStream;
        c cVar = this.f54894b;
        synchronized (cVar) {
            try {
                h hVar = (h) cVar.f54895a.get();
                ArrayList b10 = hVar.b();
                hVar.a();
                JSONArray jSONArray = new JSONArray();
                for (int i7 = 0; i7 < b10.size(); i7++) {
                    a aVar = (a) b10.get(i7);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.f54891a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.f54892b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return byteArrayOutputStream;
    }

    @Override
    public final Object call() {
        switch (this.f54893a) {
            case 0:
                return a();
            default:
                c cVar = this.f54894b;
                synchronized (cVar) {
                    ((h) cVar.f54895a.get()).i(System.currentTimeMillis(), ((cb.b) cVar.f54897c.get()).a());
                }
                return null;
        }
    }
}
