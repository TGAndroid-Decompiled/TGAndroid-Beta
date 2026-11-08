package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f57303b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f57304c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sa.d f57305a;

    public j(sa.d dVar) {
        this.f57305a = dVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f57629c)) {
            long j3 = bVar.f57631f + bVar.f57630e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f57305a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f57303b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
