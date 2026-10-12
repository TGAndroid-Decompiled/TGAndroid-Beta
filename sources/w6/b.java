package w6;

import android.content.Context;
public final class b {
    public static final b f47202b;
    public k0.b f47203a;

    static {
        ?? obj = new Object();
        obj.f47203a = null;
        f47202b = obj;
    }

    public static k0.b a(Context context) {
        k0.b bVar;
        b bVar2 = f47202b;
        synchronized (bVar2) {
            try {
                if (bVar2.f47203a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar2.f47203a = new k0.b(context, false);
                }
                bVar = bVar2.f47203a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
