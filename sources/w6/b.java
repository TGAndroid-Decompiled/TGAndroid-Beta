package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f50125b;
    public h f50126a;

    static {
        ?? obj = new Object();
        obj.f50126a = null;
        f50125b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f50125b;
        synchronized (bVar) {
            try {
                if (bVar.f50126a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f50126a = new h(context, 4);
                }
                hVar = bVar.f50126a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
