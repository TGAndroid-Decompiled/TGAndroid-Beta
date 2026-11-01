package ra;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f46486b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f46487c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final hb.a f46488a;

    public j(hb.a aVar) {
        this.f46488a = aVar;
    }

    public final boolean a(sa.a aVar) {
        if (!TextUtils.isEmpty(aVar.f48135c)) {
            long j10 = aVar.f48136f + aVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f46488a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f46486b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
