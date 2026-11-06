package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f59613b;
    public t f59614a;

    static {
        ?? obj = new Object();
        obj.f59614a = null;
        f59613b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f59613b;
        synchronized (bVar) {
            try {
                if (bVar.f59614a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f59614a = new t(context, 4);
                }
                tVar = bVar.f59614a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
