package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f59482b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f59483c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final z9.a f59484a;

    public j(z9.a aVar) {
        this.f59484a = aVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f59775c)) {
            long j3 = bVar.f59777f + bVar.f59776e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f59484a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f59482b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
