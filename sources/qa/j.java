package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f46064b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f46065c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final ob.a f46066a;

    public j(ob.a aVar) {
        this.f46066a = aVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f47136c)) {
            long j3 = bVar.f47138f + bVar.f47137e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f46066a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f46064b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
