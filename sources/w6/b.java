package w6;

import android.content.Context;
import v0.k;
public final class b {
    public static final b f44597b;
    public k f44598a;

    static {
        ?? obj = new Object();
        obj.f44598a = null;
        f44597b = obj;
    }

    public static k a(Context context) {
        k kVar;
        b bVar = f44597b;
        synchronized (bVar) {
            try {
                if (bVar.f44598a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44598a = new k(context, 1);
                }
                kVar = bVar.f44598a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
