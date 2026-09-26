package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import t7.u;
public final class j {
    public static final long f41516b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f41517c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u f41518a;

    public j(u uVar) {
        this.f41518a = uVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f42467c)) {
            long j3 = bVar.f42468f + bVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f41518a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f41516b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
