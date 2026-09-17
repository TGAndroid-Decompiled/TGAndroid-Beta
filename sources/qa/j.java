package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f44295b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f44296c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final na.d f44297a;

    public j(na.d dVar) {
        this.f44297a = dVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f45099c)) {
            long j3 = bVar.f45101f + bVar.f45100e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f44297a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f44295b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
