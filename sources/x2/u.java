package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f60282g = new AtomicLong();
    public final j2.m f60283a;
    public final Uri f60284b;
    public final Map f60285c;
    public final long d;
    public final long f60286e;
    public final long f60287f;

    public u(j2.m mVar, long j3) {
        this(mVar, mVar.f17213a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public u(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f60283a = mVar;
        this.f60284b = uri;
        this.f60285c = map;
        this.d = j3;
        this.f60286e = j10;
        this.f60287f = j11;
    }
}
