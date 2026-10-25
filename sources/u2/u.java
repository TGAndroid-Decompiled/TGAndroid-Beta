package u2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f49432g = new AtomicLong();
    public final g2.m f49433a;
    public final Uri f49434b;
    public final Map f49435c;
    public final long d;
    public final long e;
    public final long f49436f;

    public u(g2.m mVar, long j10) {
        this(mVar, mVar.f12258a, Collections.EMPTY_MAP, j10, 0L, 0L);
    }

    public u(g2.m mVar, Uri uri, Map map, long j10, long j11, long j12) {
        this.f49433a = mVar;
        this.f49434b = uri;
        this.f49435c = map;
        this.d = j10;
        this.e = j11;
        this.f49436f = j12;
    }
}
