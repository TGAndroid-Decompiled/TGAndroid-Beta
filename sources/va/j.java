package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f59354b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f59355c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final z9.a f59356a;

    public j(z9.a aVar) {
        this.f59356a = aVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f59647c)) {
            long j3 = bVar.f59649f + bVar.f59648e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f59356a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f59354b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
