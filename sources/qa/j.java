package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f46108b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f46109c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final ob.a f46110a;

    public j(ob.a aVar) {
        this.f46110a = aVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f47180c)) {
            long j3 = bVar.f47182f + bVar.f47181e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f46110a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f46108b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
