package va;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
public final class j {
    public static final long f58785b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f58786c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final z9.a f58787a;

    public j(z9.a aVar) {
        this.f58787a = aVar;
    }

    public final boolean a(wa.b bVar) {
        if (!TextUtils.isEmpty(bVar.f59082c)) {
            long j3 = bVar.f59084f + bVar.f59083e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f58787a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f58785b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
