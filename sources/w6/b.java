package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f44986b;
    public h f44987a;

    static {
        ?? obj = new Object();
        obj.f44987a = null;
        f44986b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f44986b;
        synchronized (bVar) {
            try {
                if (bVar.f44987a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44987a = new h(context, (short) 0);
                }
                hVar = bVar.f44987a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
