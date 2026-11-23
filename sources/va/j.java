package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f59397b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f59398c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final z9.a f59399a;

    public j(z9.a aVar) {
        this.f59399a = aVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f59690c)) {
            long j3 = bVar.f59692f + bVar.f59691e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f59399a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f59397b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
