package qa;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import t7.u;
public final class j {
    public static final long f44894b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern f44895c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final u f44896a;

    public j(u uVar) {
        this.f44896a = uVar;
    }

    public final boolean a(ra.b bVar) {
        if (!TextUtils.isEmpty(bVar.f45970c)) {
            long j3 = bVar.f45972f + bVar.f45971e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f44896a.getClass();
            if (j3 < timeUnit.toSeconds(System.currentTimeMillis()) + f44894b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
