package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f59722b;
    public t f59723a;

    static {
        ?? obj = new Object();
        obj.f59723a = null;
        f59722b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f59722b;
        synchronized (bVar) {
            try {
                if (bVar.f59723a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f59723a = new t(context, 4);
                }
                tVar = bVar.f59723a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
