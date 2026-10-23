package ra;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f45596b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f45597c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sb.a f45598a;

    public j(sb.a aVar) {
        this.f45598a = aVar;
    }

    public final boolean a(sa.a aVar) {
        if (!TextUtils.isEmpty(aVar.f46581c)) {
            long j10 = aVar.f46582f + aVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f45598a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f45596b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
