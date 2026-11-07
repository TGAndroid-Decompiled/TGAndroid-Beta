package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f58386g = new AtomicLong();
    public final j2.m f58387a;
    public final Uri f58388b;
    public final Map f58389c;
    public final long d;
    public final long f58390e;
    public final long f58391f;

    public u(j2.m mVar, long j3) {
        this(mVar, mVar.f16446a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public u(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f58387a = mVar;
        this.f58388b = uri;
        this.f58389c = map;
        this.d = j3;
        this.f58390e = j10;
        this.f58391f = j11;
    }
}
