package x6;

import android.content.Context;
import t6.f;
public final class b {
    public static final b f51468b;
    public f f51469a;

    static {
        ?? obj = new Object();
        obj.f51469a = null;
        f51468b = obj;
    }

    public static f a(Context context) {
        f fVar;
        b bVar = f51468b;
        synchronized (bVar) {
            try {
                if (bVar.f51469a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f51469a = new f(context);
                }
                fVar = bVar.f51469a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }
}
