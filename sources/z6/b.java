package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f61526b;
    public t f61527a;

    static {
        ?? obj = new Object();
        obj.f61527a = null;
        f61526b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f61526b;
        synchronized (bVar) {
            try {
                if (bVar.f61527a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f61527a = new t(context, 2);
                }
                tVar = bVar.f61527a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
