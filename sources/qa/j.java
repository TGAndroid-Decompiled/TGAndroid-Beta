package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import t7.u;
public final class j {
    public static final long f41519b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f41520c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u f41521a;

    public j(u uVar) {
        this.f41521a = uVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f42470c)) {
            long j3 = bVar.f42471f + bVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f41521a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f41519b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
