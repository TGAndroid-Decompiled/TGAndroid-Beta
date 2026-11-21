package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f60278g = new AtomicLong();
    public final j2.m f60279a;
    public final Uri f60280b;
    public final Map f60281c;
    public final long d;
    public final long f60282e;
    public final long f60283f;

    public u(j2.m mVar, long j3) {
        this(mVar, mVar.f17210a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public u(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f60279a = mVar;
        this.f60280b = uri;
        this.f60281c = map;
        this.d = j3;
        this.f60282e = j10;
        this.f60283f = j11;
    }
}
