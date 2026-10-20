package ra;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f45180b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f45181c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sb.a f45182a;

    public j(sb.a aVar) {
        this.f45182a = aVar;
    }

    public final boolean a(sa.a aVar) {
        if (!TextUtils.isEmpty(aVar.f46155c)) {
            long j10 = aVar.f46156f + aVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f45182a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f45180b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
