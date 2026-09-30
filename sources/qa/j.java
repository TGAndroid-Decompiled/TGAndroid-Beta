package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import t7.u;
public final class j {
    public static final long f41616b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f41617c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u f41618a;

    public j(u uVar) {
        this.f41618a = uVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f42573c)) {
            long j3 = bVar.f42574f + bVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f41618a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f41616b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
