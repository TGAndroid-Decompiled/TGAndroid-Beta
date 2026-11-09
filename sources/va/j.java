package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f57316b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f57317c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sa.d f57318a;

    public j(sa.d dVar) {
        this.f57318a = dVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f57642c)) {
            long j3 = bVar.f57644f + bVar.f57643e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f57318a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f57316b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
