package w7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class k {
    public static g2.m a(m2.m mVar, String str, m2.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri m10 = e2.a.m(str, jVar.f14424c);
        long j3 = jVar.f14422a;
        long j10 = jVar.f14423b;
        String a2 = mVar.a();
        if (a2 == null) {
            a2 = e2.a.m(((m2.b) mVar.f14429b.get(0)).f14388a, jVar.f14424c).toString();
        }
        String str2 = a2;
        e2.d.i(m10, "The uri must be set.");
        return new g2.m(m10, 1, null, e9.f1.h, j3, j10, str2, i10);
    }
}
