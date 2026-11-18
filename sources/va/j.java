package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f59355b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f59356c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final z9.a f59357a;

    public j(z9.a aVar) {
        this.f59357a = aVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f59648c)) {
            long j3 = bVar.f59650f + bVar.f59649e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f59357a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f59355b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
