package w6;

import android.content.Context;
import l5.j;
public final class b {
    public static final b f48588b;
    public j f48589a;

    static {
        ?? obj = new Object();
        obj.f48589a = null;
        f48588b = obj;
    }

    public static j a(Context context) {
        j jVar;
        b bVar = f48588b;
        synchronized (bVar) {
            try {
                if (bVar.f48589a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f48589a = new j(context, 3);
                }
                jVar = bVar.f48589a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
