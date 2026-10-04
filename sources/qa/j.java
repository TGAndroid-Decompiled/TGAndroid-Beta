package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import t7.u;
public final class j {
    public static final long f44893b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f44894c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u f44895a;

    public j(u uVar) {
        this.f44895a = uVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f45969c)) {
            long j3 = bVar.f45971f + bVar.f45970e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f44895a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f44893b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
