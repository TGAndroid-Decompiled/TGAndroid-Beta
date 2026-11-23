package x2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
public final class u {
    public static final AtomicLong f60365g = new AtomicLong();
    public final j2.m f60366a;
    public final Uri f60367b;
    public final Map f60368c;
    public final long d;
    public final long f60369e;
    public final long f60370f;

    public u(j2.m mVar, long j3) {
        this(mVar, mVar.f17276a, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public u(j2.m mVar, Uri uri, Map map, long j3, long j10, long j11) {
        this.f60366a = mVar;
        this.f60367b = uri;
        this.f60368c = map;
        this.d = j3;
        this.f60369e = j10;
        this.f60370f = j11;
    }
}
