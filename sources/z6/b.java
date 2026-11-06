package z6;

import android.content.Context;
import androidx.biometric.t;
public final class b {
    public static final b f59589b;
    public t f59590a;

    static {
        ?? obj = new Object();
        obj.f59590a = null;
        f59589b = obj;
    }

    public static t a(Context context) {
        t tVar;
        b bVar = f59589b;
        synchronized (bVar) {
            try {
                if (bVar.f59590a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f59590a = new t(context, 4);
                }
                tVar = bVar.f59590a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
