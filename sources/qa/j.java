package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import t7.u;
public final class j {
    public static final long f41518b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f41519c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u f41520a;

    public j(u uVar) {
        this.f41520a = uVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f42469c)) {
            long j3 = bVar.f42470f + bVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f41520a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f41518b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
