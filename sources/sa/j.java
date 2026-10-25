package sa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f48034b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f48035c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final qb.a f48036a;

    public j(qb.a aVar) {
        this.f48036a = aVar;
    }

    public final boolean a(ta.a aVar) {
        if (!TextUtils.isEmpty(aVar.f48757c)) {
            long j10 = aVar.f48758f + aVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f48036a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f48034b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
