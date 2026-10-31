package w6;

import android.content.Context;
import androidx.biometric.s;
public final class b {
    public static final b f52460b;
    public s f52461a;

    static {
        ?? obj = new Object();
        obj.f52461a = null;
        f52460b = obj;
    }

    public static s a(Context context) {
        s sVar;
        b bVar = f52460b;
        synchronized (bVar) {
            try {
                if (bVar.f52461a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f52461a = new s(context, 2);
                }
                sVar = bVar.f52461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }
}
