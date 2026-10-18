package w6;

import android.content.Context;
public final class b {
    public static final b f48586b;
    public q2.b f48587a;

    static {
        ?? obj = new Object();
        obj.f48587a = null;
        f48586b = obj;
    }

    public static q2.b a(Context context) {
        q2.b bVar;
        b bVar2 = f48586b;
        synchronized (bVar2) {
            try {
                if (bVar2.f48587a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar2.f48587a = new q2.b(context, 2);
                }
                bVar = bVar2.f48587a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
