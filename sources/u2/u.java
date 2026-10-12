package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f46053g = new AtomicLong();
    public final g2.m f46054a;
    public final Uri f46055b;
    public final Map f46056c;
    public final long d;
    public final long e;
    public final long f46057f;

    public u(g2.m mVar, long j10) {
        this(mVar, mVar.f9883a, Collections.EMPTY_MAP, j10, 0L, 0L);
    }

    public u(g2.m mVar, Uri uri, Map map, long j10, long j11, long j12) {
        this.f46054a = mVar;
        this.f46055b = uri;
        this.f46056c = map;
        this.d = j10;
        this.e = j11;
        this.f46057f = j12;
    }
}
