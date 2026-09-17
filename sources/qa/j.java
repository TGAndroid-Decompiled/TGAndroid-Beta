package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f44267b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f44268c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final na.d f44269a;

    public j(na.d dVar) {
        this.f44269a = dVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f45071c)) {
            long j3 = bVar.f45073f + bVar.f45072e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f44269a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f44267b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
