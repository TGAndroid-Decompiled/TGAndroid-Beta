package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f57187b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f57188c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sa.d f57189a;

    public j(sa.d dVar) {
        this.f57189a = dVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f57513c)) {
            long j3 = bVar.f57515f + bVar.f57514e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f57189a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f57187b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
