package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f57211b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f57212c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sa.d f57213a;

    public j(sa.d dVar) {
        this.f57213a = dVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f57537c)) {
            long j3 = bVar.f57539f + bVar.f57538e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f57213a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f57211b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
