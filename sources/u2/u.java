package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f50028g = new AtomicLong();
    public final g2.n f50029a;
    public final Uri f50030b;
    public final Map f50031c;
    public final long d;
    public final long e;
    public final long f50032f;

    public u(g2.n nVar, long j10) {
        this(nVar, nVar.f7315a, Collections.EMPTY_MAP, j10, 0L, 0L);
    }

    public u(g2.n nVar, Uri uri, Map map, long j10, long j11, long j12) {
        this.f50029a = nVar;
        this.f50030b = uri;
        this.f50031c = map;
        this.d = j10;
        this.e = j11;
        this.f50032f = j12;
    }
}
