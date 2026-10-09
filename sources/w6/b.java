package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f49890b;
    public h f49891a;

    static {
        ?? obj = new Object();
        obj.f49891a = null;
        f49890b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f49890b;
        synchronized (bVar) {
            try {
                if (bVar.f49891a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f49891a = new h(context, 4);
                }
                hVar = bVar.f49891a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
