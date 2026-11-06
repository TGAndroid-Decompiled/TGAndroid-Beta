package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f59614b;
    public t f59615a;

    static {
        ?? obj = new Object();
        obj.f59615a = null;
        f59614b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f59614b;
        synchronized (bVar) {
            try {
                if (bVar.f59615a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f59615a = new t(context, 4);
                }
                tVar = bVar.f59615a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
