package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f46142b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f46143c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final ob.a f46144a;

    public j(ob.a aVar) {
        this.f46144a = aVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f47226c)) {
            long j3 = bVar.f47228f + bVar.f47227e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f46144a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f46142b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
