package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f44294b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f44295c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final na.d f44296a;

    public j(na.d dVar) {
        this.f44296a = dVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f45098c)) {
            long j3 = bVar.f45100f + bVar.f45099e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f44296a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f44294b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
