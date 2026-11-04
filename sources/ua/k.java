package ua;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class k {
    public static final long f55803b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f55804c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static k d;
    public final ra.e f55805a;

    public k(ra.e eVar) {
        this.f55805a = eVar;
    }

    public final boolean a(va.b bVar) {
        if (!TextUtils.isEmpty(bVar.f56494c)) {
            long j10 = bVar.f56496f + bVar.f56495e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f55805a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f55803b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
