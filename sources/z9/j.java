package z9;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class j {

    public static final long f50275b = TimeUnit.HOURS.toSeconds(1);

    public static final Pattern f50276c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;

    public final xa.a f50277a;

    public j(xa.a aVar) {
        this.f50277a = aVar;
    }

    public final boolean a(aa.b bVar) {
        if (TextUtils.isEmpty(bVar.f207c)) {
            return true;
        }
        long j10 = bVar.f209f + bVar.f208e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f50277a.getClass();
        return j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f50275b;
    }
}
