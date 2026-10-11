package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f49977b;
    public h f49978a;

    static {
        ?? obj = new Object();
        obj.f49978a = null;
        f49977b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f49977b;
        synchronized (bVar) {
            try {
                if (bVar.f49978a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f49978a = new h(context, 4);
                }
                hVar = bVar.f49978a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
