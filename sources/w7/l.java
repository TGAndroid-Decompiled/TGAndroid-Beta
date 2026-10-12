package w7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class l {
    public static g2.m a(m2.m mVar, String str, m2.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri g10 = e2.e.g(str, jVar.f15354c);
        long j10 = jVar.f15352a;
        long j11 = jVar.f15353b;
        String a2 = mVar.a();
        if (a2 == null) {
            a2 = e2.e.g(((m2.b) mVar.f15359b.get(0)).f15318a, jVar.f15354c).toString();
        }
        String str2 = a2;
        v7.u6.l(g10, "The uri must be set.");
        return new g2.m(g10, 1, null, e9.c2.h, j10, j11, str2, i10);
    }
}
