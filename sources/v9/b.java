package v9;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
public final class b implements Callable {
    public final int f48368a;
    public final c f48369b;

    public b(c cVar, int i9) {
        this.f48368a = i9;
        this.f48369b = cVar;
    }

    private final Object a() {
        String byteArrayOutputStream;
        c cVar = this.f48369b;
        synchronized (cVar) {
            try {
                g gVar = (g) cVar.f48370a.get();
                ArrayList c10 = gVar.c();
                gVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i9 = 0; i9 < c10.size(); i9++) {
                    a aVar = (a) c10.get(i9);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.f48366a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.f48367b));
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    @Override
    public final Object call() {
        switch (this.f48368a) {
            case 0:
                return a();
            default:
                c cVar = this.f48369b;
                synchronized (cVar) {
                    ((g) cVar.f48370a.get()).k(System.currentTimeMillis(), ((fa.b) cVar.f48372c.get()).a());
                }
                return null;
        }
    }
}
