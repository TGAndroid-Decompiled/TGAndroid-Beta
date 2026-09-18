package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f44851b;
    public h f44852a;

    static {
        ?? obj = new Object();
        obj.f44852a = null;
        f44851b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f44851b;
        synchronized (bVar) {
            try {
                if (bVar.f44852a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44852a = new h(context, (short) 0);
                }
                hVar = bVar.f44852a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
