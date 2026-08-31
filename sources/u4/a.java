package u4;

import android.net.Uri;
import android.os.SystemClock;
import g5.g0;
import h5.d0;
import java.util.HashMap;
import java.util.List;
import p2.v;
public final class a implements q {
    public final c f48242a;

    public a(c cVar) {
        this.f48242a = cVar;
    }

    @Override
    public final void a() {
        this.f48242a.f48254e.remove(this);
    }

    @Override
    public final boolean c(Uri uri, v vVar, boolean z4) {
        b bVar;
        c cVar = this.f48242a;
        HashMap hashMap = cVar.d;
        if (cVar.f48259w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.f48258s;
            int i10 = d0.f7237a;
            List list = lVar.f48306e;
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                b bVar2 = (b) hashMap.get(((k) list.get(i12)).f48300a);
                if (bVar2 != null && elapsedRealtime < bVar2.f48248n) {
                    i11++;
                }
            }
            g0 g0Var = new g0(1, 0, cVar.f48258s.f48306e.size(), i11);
            cVar.f48253c.getClass();
            c4.e m32 = ab.a.m3(g0Var, vVar);
            if (m32 != null && m32.f2253a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, m32.f2254b);
            }
        }
        return false;
    }
}
