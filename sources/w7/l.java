package w7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class l {
    public static g2.m a(m2.m mVar, String str, m2.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri m10 = e2.a.m(str, jVar.f16018c);
        long j3 = jVar.f16016a;
        long j10 = jVar.f16017b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = e2.a.m(((m2.b) mVar.f16023b.get(0)).f15978a, jVar.f16018c).toString();
        }
        String str2 = b10;
        e2.d.i(m10, "The uri must be set.");
        return new g2.m(m10, 1, null, e9.f1.h, j3, j10, str2, i10);
    }
}
