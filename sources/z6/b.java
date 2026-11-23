package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f61495b;
    public t f61496a;

    static {
        ?? obj = new Object();
        obj.f61496a = null;
        f61495b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f61495b;
        synchronized (bVar) {
            try {
                if (bVar.f61496a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f61496a = new t(context, 2);
                }
                tVar = bVar.f61496a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
