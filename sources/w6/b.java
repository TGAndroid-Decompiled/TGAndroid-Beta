package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f44879b;
    public h f44880a;

    static {
        ?? obj = new Object();
        obj.f44880a = null;
        f44879b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f44879b;
        synchronized (bVar) {
            try {
                if (bVar.f44880a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44880a = new h(context, (short) 0);
                }
                hVar = bVar.f44880a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
