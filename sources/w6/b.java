package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f44895b;
    public h f44896a;

    static {
        ?? obj = new Object();
        obj.f44896a = null;
        f44895b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f44895b;
        synchronized (bVar) {
            try {
                if (bVar.f44896a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44896a = new h(context, (short) 0);
                }
                hVar = bVar.f44896a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
