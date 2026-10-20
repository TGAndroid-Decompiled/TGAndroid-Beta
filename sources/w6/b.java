package w6;

import android.content.Context;
import l5.j;
public final class b {
    public static final b f48593b;
    public j f48594a;

    static {
        ?? obj = new Object();
        obj.f48594a = null;
        f48593b = obj;
    }

    public static j a(Context context) {
        j jVar;
        b bVar = f48593b;
        synchronized (bVar) {
            try {
                if (bVar.f48594a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f48594a = new j(context, 3);
                }
                jVar = bVar.f48594a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
