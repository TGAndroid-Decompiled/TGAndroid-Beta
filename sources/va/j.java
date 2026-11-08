package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f57304b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f57305c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sa.d f57306a;

    public j(sa.d dVar) {
        this.f57306a = dVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f57630c)) {
            long j3 = bVar.f57632f + bVar.f57631e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f57306a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f57304b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
