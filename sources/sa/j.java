package sa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f48037b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f48038c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final qb.a f48039a;

    public j(qb.a aVar) {
        this.f48039a = aVar;
    }

    public final boolean a(ta.a aVar) {
        if (!TextUtils.isEmpty(aVar.f48760c)) {
            long j10 = aVar.f48761f + aVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f48039a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f48037b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
