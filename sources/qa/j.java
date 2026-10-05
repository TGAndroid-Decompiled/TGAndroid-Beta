package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import t7.u;
public final class j {
    public static final long f44908b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f44909c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u f44910a;

    public j(u uVar) {
        this.f44910a = uVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f45984c)) {
            long j3 = bVar.f45986f + bVar.f45985e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f44910a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f44908b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
