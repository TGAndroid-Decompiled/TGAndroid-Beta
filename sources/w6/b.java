package w6;

import android.content.Context;
public final class b {
    public static final b f48633b;
    public q2.b f48634a;

    static {
        ?? obj = new Object();
        obj.f48634a = null;
        f48633b = obj;
    }

    public static q2.b a(Context context) {
        q2.b bVar;
        b bVar2 = f48633b;
        synchronized (bVar2) {
            try {
                if (bVar2.f48634a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar2.f48634a = new q2.b(context, 2);
                }
                bVar = bVar2.f48634a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
