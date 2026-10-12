package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f46009b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f46010c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final qb.b f46011a;

    public j(qb.b bVar) {
        this.f46011a = bVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f47358c)) {
            long j3 = bVar.f47360f + bVar.f47359e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f46011a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f46009b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
