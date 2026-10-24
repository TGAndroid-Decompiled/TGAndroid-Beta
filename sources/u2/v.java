package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class v {
    public static final AtomicLong f47897g = new AtomicLong();
    public final g2.m f47898a;
    public final Uri f47899b;
    public final Map f47900c;
    public final long d;
    public final long e;
    public final long f47901f;

    public v(g2.m mVar, long j10) {
        this(mVar, mVar.f10810a, Collections.EMPTY_MAP, j10, 0L, 0L);
    }

    public v(g2.m mVar, Uri uri, Map map, long j10, long j11, long j12) {
        this.f47898a = mVar;
        this.f47899b = uri;
        this.f47900c = map;
        this.d = j10;
        this.e = j11;
        this.f47901f = j12;
    }
}
