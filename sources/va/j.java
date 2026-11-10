package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f57312b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f57313c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sa.d f57314a;

    public j(sa.d dVar) {
        this.f57314a = dVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f57641c)) {
            long j3 = bVar.f57643f + bVar.f57642e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f57314a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f57312b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
