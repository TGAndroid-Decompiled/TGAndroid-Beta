package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f58485g = new AtomicLong();
    public final j2.m f58486a;
    public final Uri f58487b;
    public final Map f58488c;
    public final long d;
    public final long f58489e;
    public final long f58490f;

    public u(j2.m mVar, long j3) {
        this(mVar, mVar.f16449a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public u(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f58486a = mVar;
        this.f58487b = uri;
        this.f58488c = map;
        this.d = j3;
        this.f58489e = j10;
        this.f58490f = j11;
    }
}
