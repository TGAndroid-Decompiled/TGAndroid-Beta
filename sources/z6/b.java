package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f59720b;
    public t f59721a;

    static {
        ?? obj = new Object();
        obj.f59721a = null;
        f59720b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f59720b;
        synchronized (bVar) {
            try {
                if (bVar.f59721a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f59721a = new t(context, 4);
                }
                tVar = bVar.f59721a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
