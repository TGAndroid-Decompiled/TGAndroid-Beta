package w6;

import android.content.Context;
import v0.k;
public final class b {
    public static final b f44593b;
    public k f44594a;

    static {
        ?? obj = new Object();
        obj.f44594a = null;
        f44593b = obj;
    }

    public static k a(Context context) {
        k kVar;
        b bVar = f44593b;
        synchronized (bVar) {
            try {
                if (bVar.f44594a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44594a = new k(context, 1);
                }
                kVar = bVar.f44594a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
