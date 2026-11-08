package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f59712b;
    public t f59713a;

    static {
        ?? obj = new Object();
        obj.f59713a = null;
        f59712b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f59712b;
        synchronized (bVar) {
            try {
                if (bVar.f59713a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f59713a = new t(context, 4);
                }
                tVar = bVar.f59713a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
