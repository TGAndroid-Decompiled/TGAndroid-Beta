package ra;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f45218b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f45219c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sb.a f45220a;

    public j(sb.a aVar) {
        this.f45220a = aVar;
    }

    public final boolean a(sa.a aVar) {
        if (!TextUtils.isEmpty(aVar.f46196c)) {
            long j10 = aVar.f46197f + aVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f45220a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f45218b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
