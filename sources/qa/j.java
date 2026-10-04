package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import t7.u;
public final class j {
    public static final long f44901b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f44902c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u f44903a;

    public j(u uVar) {
        this.f44903a = uVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f45977c)) {
            long j3 = bVar.f45979f + bVar.f45978e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f44903a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f44901b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
