package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f47439g = new AtomicLong();
    public final g2.m f47440a;
    public final Uri f47441b;
    public final Map f47442c;
    public final long d;
    public final long e;
    public final long f47443f;

    public u(g2.m mVar, long j10) {
        this(mVar, mVar.f10791a, Collections.EMPTY_MAP, j10, 0L, 0L);
    }

    public u(g2.m mVar, Uri uri, Map map, long j10, long j11, long j12) {
        this.f47440a = mVar;
        this.f47441b = uri;
        this.f47442c = map;
        this.d = j10;
        this.e = j11;
        this.f47443f = j12;
    }
}
