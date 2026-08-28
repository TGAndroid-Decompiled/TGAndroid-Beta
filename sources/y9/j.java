package y9;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f49679b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f49680c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final ya.b f49681a;

    public j(ya.b bVar) {
        this.f49681a = bVar;
    }

    public final boolean a(z9.a aVar) {
        if (!TextUtils.isEmpty(aVar.f50389c)) {
            long j10 = aVar.f50391f + aVar.f50390e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f49681a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f49679b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
