package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f44880b;
    public h f44881a;

    static {
        ?? obj = new Object();
        obj.f44881a = null;
        f44880b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f44880b;
        synchronized (bVar) {
            try {
                if (bVar.f44881a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44881a = new h(context, (short) 0);
                }
                hVar = bVar.f44881a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
