package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f61614b;
    public t f61615a;

    static {
        ?? obj = new Object();
        obj.f61615a = null;
        f61614b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f61614b;
        synchronized (bVar) {
            try {
                if (bVar.f61615a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f61615a = new t(context, (byte) 0);
                }
                tVar = bVar.f61615a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
