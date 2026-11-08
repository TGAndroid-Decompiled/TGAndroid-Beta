package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f58476g = new AtomicLong();
    public final j2.m f58477a;
    public final Uri f58478b;
    public final Map f58479c;
    public final long d;
    public final long f58480e;
    public final long f58481f;

    public u(j2.m mVar, long j3) {
        this(mVar, mVar.f16449a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public u(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f58477a = mVar;
        this.f58478b = uri;
        this.f58479c = map;
        this.d = j3;
        this.f58480e = j10;
        this.f58481f = j11;
    }
}
