package w6;

import android.content.Context;
import l5.j;
public final class b {
    public static final b f48586b;
    public j f48587a;

    static {
        ?? obj = new Object();
        obj.f48587a = null;
        f48586b = obj;
    }

    public static j a(Context context) {
        j jVar;
        b bVar = f48586b;
        synchronized (bVar) {
            try {
                if (bVar.f48587a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f48587a = new j(context, 3);
                }
                jVar = bVar.f48587a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
