package y5;

import android.content.Context;
import android.util.Log;
public abstract class o {
    public static final k f47098a;
    public static final k f47099b;
    public static Context f47100c;

    static {
        new k(l.J0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 0);
        new k(l.J0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 1);
        f47098a = new k(l.J0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 2);
        f47099b = new k(l.J0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 3);
    }

    public static synchronized void a(Context context) {
        synchronized (o.class) {
            if (f47100c == null) {
                if (context != null) {
                    f47100c = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }
}
