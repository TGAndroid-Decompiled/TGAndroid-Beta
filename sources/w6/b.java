package w6;

import android.content.Context;
import l5.j;
public final class b {
    public static final b f48597b;
    public j f48598a;

    static {
        ?? obj = new Object();
        obj.f48598a = null;
        f48597b = obj;
    }

    public static j a(Context context) {
        j jVar;
        b bVar = f48597b;
        synchronized (bVar) {
            try {
                if (bVar.f48598a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f48598a = new j(context, 3);
                }
                jVar = bVar.f48598a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
