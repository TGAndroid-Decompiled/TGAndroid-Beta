package w7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class l {
    public static g2.m a(m2.m mVar, String str, m2.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri g10 = e2.e.g(str, jVar.f16442c);
        long j10 = jVar.f16440a;
        long j11 = jVar.f16441b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = e2.e.g(((m2.b) mVar.f16447b.get(0)).f16406a, jVar.f16442c).toString();
        }
        String str2 = b10;
        v7.u6.l(g10, "The uri must be set.");
        return new g2.m(g10, 1, null, e9.c2.h, j10, j11, str2, i10);
    }
}
