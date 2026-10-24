package ra;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f45595b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f45596c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sb.a f45597a;

    public j(sb.a aVar) {
        this.f45597a = aVar;
    }

    public final boolean a(sa.a aVar) {
        if (!TextUtils.isEmpty(aVar.f46580c)) {
            long j10 = aVar.f46581f + aVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f45597a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f45595b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
