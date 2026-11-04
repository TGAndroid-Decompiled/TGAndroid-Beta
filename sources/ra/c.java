package ra;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
public final class c implements Callable {
    public final int f54455a;
    public final d f54456b;

    public c(d dVar, int i3) {
        this.f54455a = i3;
        this.f54456b = dVar;
    }

    private final Object a() {
        String byteArrayOutputStream;
        d dVar = this.f54456b;
        synchronized (dVar) {
            try {
                i iVar = (i) dVar.f54457a.get();
                ArrayList b10 = iVar.b();
                iVar.a();
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < b10.size(); i3++) {
                    a aVar = (a) b10.get(i3);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.f54451a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.f54452b));
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
        switch (this.f54455a) {
            case 0:
                return a();
            default:
                d dVar = this.f54456b;
                synchronized (dVar) {
                    ((i) dVar.f54457a.get()).i(System.currentTimeMillis(), ((bb.b) dVar.f54459c.get()).a());
                }
                return null;
        }
    }
}
