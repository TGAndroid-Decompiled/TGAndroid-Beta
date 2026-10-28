package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f49470g = new AtomicLong();
    public final g2.m f49471a;
    public final Uri f49472b;
    public final Map f49473c;
    public final long d;
    public final long e;
    public final long f49474f;

    public u(g2.m mVar, long j10) {
        this(mVar, mVar.f12257a, Collections.EMPTY_MAP, j10, 0L, 0L);
    }

    public u(g2.m mVar, Uri uri, Map map, long j10, long j11, long j12) {
        this.f49471a = mVar;
        this.f49472b = uri;
        this.f49473c = map;
        this.d = j10;
        this.e = j11;
        this.f49474f = j12;
    }
}
