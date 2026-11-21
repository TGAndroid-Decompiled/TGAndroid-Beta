package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f59393b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f59394c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final z9.a f59395a;

    public j(z9.a aVar) {
        this.f59395a = aVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f59686c)) {
            long j3 = bVar.f59688f + bVar.f59687e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f59395a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f59393b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
