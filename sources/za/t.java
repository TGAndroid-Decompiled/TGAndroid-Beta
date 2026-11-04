package za;

import android.content.SharedPreferences;
import android.text.TextUtils;
import b8.ke;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;
public final class t {
    public static WeakReference d;
    public final SharedPreferences f60323a;
    public ke f60324b;
    public final ScheduledThreadPoolExecutor f60325c;

    public t(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f60325c = scheduledThreadPoolExecutor;
        this.f60323a = sharedPreferences;
    }

    public final synchronized s a() {
        s sVar;
        String C = this.f60324b.C();
        Pattern pattern = s.d;
        sVar = null;
        if (!TextUtils.isEmpty(C)) {
            String[] split = C.split("!", -1);
            if (split.length == 2) {
                sVar = new s(split[0], split[1]);
            }
        }
        return sVar;
    }

    public final synchronized void b() {
        this.f60324b = ke.l(this.f60323a, this.f60325c);
    }

    public final synchronized void c(s sVar) {
        this.f60324b.H(sVar.f60322c);
    }
}
