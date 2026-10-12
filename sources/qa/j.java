package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f46001b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f46002c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final qb.b f46003a;

    public j(qb.b bVar) {
        this.f46003a = bVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f47350c)) {
            long j3 = bVar.f47352f + bVar.f47351e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f46003a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f46001b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
