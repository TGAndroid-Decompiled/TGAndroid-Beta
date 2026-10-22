package w6;

import android.content.Context;
import l5.j;
public final class b {
    public static final b f48596b;
    public j f48597a;

    static {
        ?? obj = new Object();
        obj.f48597a = null;
        f48596b = obj;
    }

    public static j a(Context context) {
        j jVar;
        b bVar = f48596b;
        synchronized (bVar) {
            try {
                if (bVar.f48597a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f48597a = new j(context, 3);
                }
                jVar = bVar.f48597a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
