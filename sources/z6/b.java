package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f61484b;
    public t f61485a;

    static {
        ?? obj = new Object();
        obj.f61485a = null;
        f61484b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f61484b;
        synchronized (bVar) {
            try {
                if (bVar.f61485a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f61485a = new t(context, 2);
                }
                tVar = bVar.f61485a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
