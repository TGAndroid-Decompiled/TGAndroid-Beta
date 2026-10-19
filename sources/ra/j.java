package ra;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f45170b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f45171c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final sb.a f45172a;

    public j(sb.a aVar) {
        this.f45172a = aVar;
    }

    public final boolean a(sa.a aVar) {
        if (!TextUtils.isEmpty(aVar.f46148c)) {
            long j10 = aVar.f46149f + aVar.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f45172a.getClass();
            if (j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f45170b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
