package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f61485b;
    public t f61486a;

    static {
        ?? obj = new Object();
        obj.f61486a = null;
        f61485b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f61485b;
        synchronized (bVar) {
            try {
                if (bVar.f61486a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f61486a = new t(context, 2);
                }
                tVar = bVar.f61486a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
