package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f60236g = new AtomicLong();
    public final j2.m f60237a;
    public final Uri f60238b;
    public final Map f60239c;
    public final long d;
    public final long f60240e;
    public final long f60241f;

    public u(j2.m mVar, long j3) {
        this(mVar, mVar.f17188a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public u(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f60237a = mVar;
        this.f60238b = uri;
        this.f60239c = map;
        this.d = j3;
        this.f60240e = j10;
        this.f60241f = j11;
    }
}
