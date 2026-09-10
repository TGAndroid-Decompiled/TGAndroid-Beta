package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import t7.u;
public final class j {
    public static final long f40605b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f40606c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u f40607a;

    public j(u uVar) {
        this.f40607a = uVar;
    }

    public final boolean a(ra.a aVar) {
        if (!TextUtils.isEmpty(aVar.f41394c)) {
            long j3 = aVar.f41395f + aVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f40607a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f40605b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
