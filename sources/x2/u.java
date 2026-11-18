package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f60237g = new AtomicLong();
    public final j2.m f60238a;
    public final Uri f60239b;
    public final Map f60240c;
    public final long d;
    public final long f60241e;
    public final long f60242f;

    public u(j2.m mVar, long j3) {
        this(mVar, mVar.f17185a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public u(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f60238a = mVar;
        this.f60239b = uri;
        this.f60240c = map;
        this.d = j3;
        this.f60241e = j10;
        this.f60242f = j11;
    }
}
