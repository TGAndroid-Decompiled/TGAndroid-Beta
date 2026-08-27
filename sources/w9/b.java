package w9;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b implements Callable {

    public final int f49279a;

    public final c f49280b;

    public b(c cVar, int i10) {
        this.f49279a = i10;
        this.f49280b = cVar;
    }

    private final Object a() {
        String string;
        c cVar = this.f49280b;
        synchronized (cVar) {
            try {
                g gVar = (g) cVar.f49281a.get();
                ArrayList arrayListC = gVar.c();
                gVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < arrayListC.size(); i10++) {
                    a aVar = (a) arrayListC.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.f49277a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.f49278b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    @Override
    public final Object call() {
        switch (this.f49279a) {
            case 0:
                return a();
            default:
                c cVar = this.f49280b;
                synchronized (cVar) {
                    ((g) cVar.f49281a.get()).k(System.currentTimeMillis(), ((ga.b) cVar.f49283c.get()).a());
                    break;
                }
                return null;
        }
    }
}
