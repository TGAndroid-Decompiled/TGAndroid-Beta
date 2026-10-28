package sa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f48075b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f48076c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final qb.a f48077a;

    public j(qb.a aVar) {
        this.f48077a = aVar;
    }

    public final boolean a(ta.a aVar) {
        if (!TextUtils.isEmpty(aVar.f48795c)) {
            long j10 = aVar.f48796f + aVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f48077a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f48075b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
