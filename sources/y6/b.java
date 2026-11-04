package y6;

import android.content.Context;
import androidx.emoji2.text.n;
public final class b {
    public static final b f59037b;
    public n f59038a;

    static {
        ?? obj = new Object();
        obj.f59038a = null;
        f59037b = obj;
    }

    public static n a(Context context) {
        n nVar;
        b bVar = f59037b;
        synchronized (bVar) {
            try {
                if (bVar.f59038a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f59038a = new n(context, (char) 0);
                }
                nVar = bVar.f59038a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }
}
