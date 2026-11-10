package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class t {
    public static final AtomicLong f58482g = new AtomicLong();
    public final j2.m f58483a;
    public final Uri f58484b;
    public final Map f58485c;
    public final long d;
    public final long f58486e;
    public final long f58487f;

    public t(j2.m mVar, long j3) {
        this(mVar, mVar.f16449a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public t(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f58483a = mVar;
        this.f58484b = uri;
        this.f58485c = map;
        this.d = j3;
        this.f58486e = j10;
        this.f58487f = j11;
    }
}
