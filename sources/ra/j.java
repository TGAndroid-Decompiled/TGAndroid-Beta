package ra;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f46475b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f46476c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final hb.a f46477a;

    public j(hb.a aVar) {
        this.f46477a = aVar;
    }

    public final boolean a(sa.a aVar) {
        if (!TextUtils.isEmpty(aVar.f48124c)) {
            long j10 = aVar.f48125f + aVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f46477a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f46475b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
