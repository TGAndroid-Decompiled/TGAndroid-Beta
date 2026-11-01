package xa;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;
public final class q {
    public static WeakReference d;
    public final SharedPreferences f53581a;
    public bh.d f53582b;
    public final ScheduledThreadPoolExecutor f53583c;

    public q(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f53583c = scheduledThreadPoolExecutor;
        this.f53581a = sharedPreferences;
    }

    public final synchronized p a() {
        p pVar;
        String H = this.f53582b.H();
        Pattern pattern = p.d;
        pVar = null;
        if (!TextUtils.isEmpty(H)) {
            String[] split = H.split("!", -1);
            if (split.length == 2) {
                pVar = new p(split[0], split[1]);
            }
        }
        return pVar;
    }

    public final synchronized void b() {
        this.f53582b = bh.d.o(this.f53581a, this.f53583c);
    }

    public final synchronized void c(p pVar) {
        this.f53582b.I(pVar.f53580c);
    }
}
