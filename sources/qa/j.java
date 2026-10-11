package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f46176b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f46177c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final ob.a f46178a;

    public j(ob.a aVar) {
        this.f46178a = aVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f47260c)) {
            long j3 = bVar.f47262f + bVar.f47261e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f46178a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f46176b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
