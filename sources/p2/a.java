package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
public final class a implements u {
    public final d f40422a;

    public a(d dVar) {
        this.f40422a = dVar;
    }

    @Override
    public final void a() {
        this.f40422a.e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        c cVar;
        d dVar = this.f40422a;
        HashMap hashMap = dVar.d;
        if (dVar.f40441w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            p pVar = dVar.f40440s;
            String str = d0.f7888a;
            List list = pVar.e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                c cVar2 = (c) hashMap.get(((o) list.get(i11)).f40511a);
                if (cVar2 != null && elapsedRealtime < cVar2.f40430n) {
                    i10++;
                }
            }
            y2.g gVar = new y2.g(1, 0, dVar.f40440s.e.size(), i10);
            dVar.f40436c.getClass();
            k4.d K3 = qb.b.K3(gVar, b0Var);
            if (K3 != null && K3.f13435a == 2 && (cVar = (c) hashMap.get(uri)) != null) {
                c.a(cVar, K3.f13436b);
            }
        }
        return false;
    }
}
