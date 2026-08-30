package u4;

import android.net.Uri;
import android.os.SystemClock;
import g5.g0;
import h5.d0;
import java.util.HashMap;
import java.util.List;
import p2.w;
public final class a implements q {
    public final c f44999a;

    public a(c cVar) {
        this.f44999a = cVar;
    }

    @Override
    public final void a() {
        this.f44999a.e.remove(this);
    }

    @Override
    public final boolean c(Uri uri, w wVar, boolean z4) {
        b bVar;
        c cVar = this.f44999a;
        HashMap hashMap = cVar.d;
        if (cVar.f45014w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.f45013s;
            int i10 = d0.f6937a;
            List list = lVar.e;
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                b bVar2 = (b) hashMap.get(((k) list.get(i12)).f45052a);
                if (bVar2 != null && elapsedRealtime < bVar2.f45004n) {
                    i11++;
                }
            }
            g0 g0Var = new g0(1, 0, cVar.f45013s.e.size(), i11);
            cVar.f45009c.getClass();
            c4.e m32 = ab.a.m3(g0Var, wVar);
            if (m32 != null && m32.f2072a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, m32.f2073b);
            }
        }
        return false;
    }
}
