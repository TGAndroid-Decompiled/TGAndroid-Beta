package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f44266b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f44267c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final na.d f44268a;

    public j(na.d dVar) {
        this.f44268a = dVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f45070c)) {
            long j3 = bVar.f45072f + bVar.f45071e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f44268a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f44266b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
