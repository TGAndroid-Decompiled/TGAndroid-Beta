package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class t {
    public static final AtomicLong f47480g = new AtomicLong();
    public final g2.m f47481a;
    public final Uri f47482b;
    public final Map f47483c;
    public final long d;
    public final long e;
    public final long f47484f;

    public t(g2.m mVar, long j10) {
        this(mVar, mVar.f10794a, Collections.EMPTY_MAP, j10, 0L, 0L);
    }

    public t(g2.m mVar, Uri uri, Map map, long j10, long j11, long j12) {
        this.f47481a = mVar;
        this.f47482b = uri;
        this.f47483c = map;
        this.d = j10;
        this.e = j11;
        this.f47484f = j12;
    }
}
