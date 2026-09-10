package w7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class k {
    public static g2.m a(m2.m mVar, String str, m2.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri m10 = e2.a.m(str, jVar.f13264c);
        long j3 = jVar.f13262a;
        long j10 = jVar.f13263b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = e2.a.m(((m2.b) mVar.f13269b.get(0)).f13228a, jVar.f13264c).toString();
        }
        String str2 = b10;
        e2.d.i(m10, "The uri must be set.");
        return new g2.m(m10, 1, null, e9.f1.h, j3, j10, str2, i10);
    }
}
