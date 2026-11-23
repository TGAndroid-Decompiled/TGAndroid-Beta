package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f59360b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f59361c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final z9.a f59362a;

    public j(z9.a aVar) {
        this.f59362a = aVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f59655c)) {
            long j3 = bVar.f59657f + bVar.f59656e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f59362a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f59360b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
