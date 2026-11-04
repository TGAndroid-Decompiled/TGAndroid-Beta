package w2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f57230g = new AtomicLong();
    public final i2.n f57231a;
    public final Uri f57232b;
    public final Map f57233c;
    public final long d;
    public final long f57234e;
    public final long f57235f;

    public u(i2.n nVar, long j10) {
        this(nVar, nVar.f14564a, Collections.EMPTY_MAP, j10, 0L, 0L);
    }

    public u(i2.n nVar, Uri uri, Map map, long j10, long j11, long j12) {
        this.f57231a = nVar;
        this.f57232b = uri;
        this.f57233c = map;
        this.d = j10;
        this.f57234e = j11;
        this.f57235f = j12;
    }
}
