package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f58381g = new AtomicLong();
    public final j2.m f58382a;
    public final Uri f58383b;
    public final Map f58384c;
    public final long d;
    public final long f58385e;
    public final long f58386f;

    public u(j2.m mVar, long j3) {
        this(mVar, mVar.f16446a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public u(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f58382a = mVar;
        this.f58383b = uri;
        this.f58384c = map;
        this.d = j3;
        this.f58385e = j10;
        this.f58386f = j11;
    }
}
