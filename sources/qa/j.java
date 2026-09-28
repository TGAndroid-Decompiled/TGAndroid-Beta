package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import t7.u;
public final class j {
    public static final long f41517b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f41518c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u f41519a;

    public j(u uVar) {
        this.f41519a = uVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f42468c)) {
            long j3 = bVar.f42469f + bVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f41519a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f41517b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
