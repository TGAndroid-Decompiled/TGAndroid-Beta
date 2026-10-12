package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f50117b;
    public h f50118a;

    static {
        ?? obj = new Object();
        obj.f50118a = null;
        f50117b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f50117b;
        synchronized (bVar) {
            try {
                if (bVar.f50118a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f50118a = new h(context, 4);
                }
                hVar = bVar.f50118a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
