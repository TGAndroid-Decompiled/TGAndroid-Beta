package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f60247g = new AtomicLong();
    public final j2.m f60248a;
    public final Uri f60249b;
    public final Map f60250c;
    public final long d;
    public final long f60251e;
    public final long f60252f;

    public u(j2.m mVar, long j3) {
        this(mVar, mVar.f17179a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public u(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f60248a = mVar;
        this.f60249b = uri;
        this.f60250c = map;
        this.d = j3;
        this.f60251e = j10;
        this.f60252f = j11;
    }
}
