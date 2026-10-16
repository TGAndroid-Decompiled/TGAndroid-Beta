package w6;

import android.content.Context;
public final class b {
    public static final b f47201b;
    public k0.b f47202a;

    static {
        ?? obj = new Object();
        obj.f47202a = null;
        f47201b = obj;
    }

    public static k0.b a(Context context) {
        k0.b bVar;
        b bVar2 = f47201b;
        synchronized (bVar2) {
            try {
                if (bVar2.f47202a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar2.f47202a = new k0.b(context, (byte) 0);
                }
                bVar = bVar2.f47202a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
