package w6;

import android.content.Context;
import k6.h;
public final class b {
    public static final b f44923b;
    public h f44924a;

    static {
        ?? obj = new Object();
        obj.f44924a = null;
        f44923b = obj;
    }

    public static h a(Context context) {
        h hVar;
        b bVar = f44923b;
        synchronized (bVar) {
            try {
                if (bVar.f44924a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f44924a = new h(context, (short) 0);
                }
                hVar = bVar.f44924a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
