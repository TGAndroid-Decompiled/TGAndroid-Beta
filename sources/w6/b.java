package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f49934b;
    public h f49935a;

    static {
        ?? obj = new Object();
        obj.f49935a = null;
        f49934b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f49934b;
        synchronized (bVar) {
            try {
                if (bVar.f49935a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f49935a = new h(context, 4);
                }
                hVar = bVar.f49935a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
