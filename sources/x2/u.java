package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f58356g = new AtomicLong();
    public final j2.m f58357a;
    public final Uri f58358b;
    public final Map f58359c;
    public final long d;
    public final long f58360e;
    public final long f58361f;

    public u(j2.m mVar, long j3) {
        this(mVar, mVar.f16446a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public u(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f58357a = mVar;
        this.f58358b = uri;
        this.f58359c = map;
        this.d = j3;
        this.f58360e = j10;
        this.f58361f = j11;
    }
}
