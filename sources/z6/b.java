package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f60920b;
    public t f60921a;

    static {
        ?? obj = new Object();
        obj.f60921a = null;
        f60920b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f60920b;
        synchronized (bVar) {
            try {
                if (bVar.f60921a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f60921a = new t(context, false);
                }
                tVar = bVar.f60921a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
