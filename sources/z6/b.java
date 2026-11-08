package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f59713b;
    public t f59714a;

    static {
        ?? obj = new Object();
        obj.f59714a = null;
        f59713b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f59713b;
        synchronized (bVar) {
            try {
                if (bVar.f59714a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f59714a = new t(context, 4);
                }
                tVar = bVar.f59714a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
