package x6;

import android.content.Context;
import t6.f;
public final class b {
    public static final b f51407b;
    public f f51408a;

    static {
        ?? obj = new Object();
        obj.f51408a = null;
        f51407b = obj;
    }

    public static f a(Context context) {
        f fVar;
        b bVar = f51407b;
        synchronized (bVar) {
            try {
                if (bVar.f51408a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f51408a = new f(context);
                }
                fVar = bVar.f51408a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }
}
