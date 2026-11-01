package w6;

import android.content.Context;
import androidx.biometric.s;
public final class b {
    public static final b f52478b;
    public s f52479a;

    static {
        ?? obj = new Object();
        obj.f52479a = null;
        f52478b = obj;
    }

    public static s a(Context context) {
        s sVar;
        b bVar = f52478b;
        synchronized (bVar) {
            try {
                if (bVar.f52479a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f52479a = new s(context, 2);
                }
                sVar = bVar.f52479a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }
}
