package x6;

import android.content.Context;
import t6.f;
public final class b {
    public static final b f51410b;
    public f f51411a;

    static {
        ?? obj = new Object();
        obj.f51411a = null;
        f51410b = obj;
    }

    public static f a(Context context) {
        f fVar;
        b bVar = f51410b;
        synchronized (bVar) {
            try {
                if (bVar.f51411a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f51411a = new f(context);
                }
                fVar = bVar.f51411a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }
}
