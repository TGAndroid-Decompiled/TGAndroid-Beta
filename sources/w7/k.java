package w7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public abstract class k {
    public static g2.n a(m2.m mVar, String str, m2.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri g10 = e2.e.g(str, jVar.f12663c);
        long j10 = jVar.f12661a;
        long j11 = jVar.f12662b;
        String b10 = mVar.b();
        if (b10 == null) {
            b10 = e2.e.g(((m2.b) mVar.f12668b.get(0)).f12627a, jVar.f12663c).toString();
        }
        String str2 = b10;
        v7.t6.l(g10, "The uri must be set.");
        return new g2.n(g10, 1, null, e9.c2.h, j10, j11, str2, i10);
    }
}
