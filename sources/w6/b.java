package w6;

import android.content.Context;
public final class b {
    public static final b f43556b;
    public k0.b f43557a;

    static {
        ?? obj = new Object();
        obj.f43557a = null;
        f43556b = obj;
    }

    public static k0.b a(Context context) {
        k0.b bVar;
        b bVar2 = f43556b;
        synchronized (bVar2) {
            try {
                if (bVar2.f43557a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar2.f43557a = new k0.b(context, false);
                }
                bVar = bVar2.f43557a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
