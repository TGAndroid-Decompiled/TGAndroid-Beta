package ra;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f44083b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f44084c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sb.a f44085a;

    public j(sb.a aVar) {
        this.f44085a = aVar;
    }

    public final boolean a(sa.a aVar) {
        if (!TextUtils.isEmpty(aVar.f45079c)) {
            long j10 = aVar.f45080f + aVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f44085a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f44083b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
