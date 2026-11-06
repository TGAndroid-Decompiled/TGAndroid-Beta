package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f57212b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f57213c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sa.d f57214a;

    public j(sa.d dVar) {
        this.f57214a = dVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f57538c)) {
            long j3 = bVar.f57540f + bVar.f57539e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f57214a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f57212b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
