package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f58380g = new AtomicLong();
    public final j2.m f58381a;
    public final Uri f58382b;
    public final Map f58383c;
    public final long d;
    public final long f58384e;
    public final long f58385f;

    public u(j2.m mVar, long j3) {
        this(mVar, mVar.f16446a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public u(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f58381a = mVar;
        this.f58382b = uri;
        this.f58383c = map;
        this.d = j3;
        this.f58384e = j10;
        this.f58385f = j11;
    }
}
