package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f58475g = new AtomicLong();
    public final j2.m f58476a;
    public final Uri f58477b;
    public final Map f58478c;
    public final long d;
    public final long f58479e;
    public final long f58480f;

    public u(j2.m mVar, long j3) {
        this(mVar, mVar.f16449a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public u(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f58476a = mVar;
        this.f58477b = uri;
        this.f58478c = map;
        this.d = j3;
        this.f58479e = j10;
        this.f58480f = j11;
    }
}
