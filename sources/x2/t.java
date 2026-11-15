package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class t {
    public static final AtomicLong f59664g = new AtomicLong();
    public final j2.m f59665a;
    public final Uri f59666b;
    public final Map f59667c;
    public final long d;
    public final long f59668e;
    public final long f59669f;

    public t(j2.m mVar, long j3) {
        this(mVar, mVar.f16803a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public t(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f59665a = mVar;
        this.f59666b = uri;
        this.f59667c = map;
        this.d = j3;
        this.f59668e = j10;
        this.f59669f = j11;
    }
}
