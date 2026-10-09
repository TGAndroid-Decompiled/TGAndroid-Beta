package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f46062b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f46063c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final ob.a f46064a;

    public j(ob.a aVar) {
        this.f46064a = aVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f47134c)) {
            long j3 = bVar.f47136f + bVar.f47135e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f46064a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f46062b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
