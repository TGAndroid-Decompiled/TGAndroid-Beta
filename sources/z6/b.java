package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f61530b;
    public t f61531a;

    static {
        ?? obj = new Object();
        obj.f61531a = null;
        f61530b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f61530b;
        synchronized (bVar) {
            try {
                if (bVar.f61531a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f61531a = new t(context, 2);
                }
                tVar = bVar.f61531a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
