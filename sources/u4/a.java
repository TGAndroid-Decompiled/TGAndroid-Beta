package u4;

import android.net.Uri;
import android.os.SystemClock;
import g5.g0;
import h5.d0;
import java.util.HashMap;
import java.util.List;
import p2.w;
public final class a implements q {
    public final c f45061a;

    public a(c cVar) {
        this.f45061a = cVar;
    }

    @Override
    public final void a() {
        this.f45061a.e.remove(this);
    }

    @Override
    public final boolean c(Uri uri, w wVar, boolean z4) {
        b bVar;
        c cVar = this.f45061a;
        HashMap hashMap = cVar.d;
        if (cVar.f45076w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.f45075s;
            int i10 = d0.f6924a;
            List list = lVar.e;
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                b bVar2 = (b) hashMap.get(((k) list.get(i12)).f45114a);
                if (bVar2 != null && elapsedRealtime < bVar2.f45066n) {
                    i11++;
                }
            }
            g0 g0Var = new g0(1, 0, cVar.f45075s.e.size(), i11);
            cVar.f45071c.getClass();
            c4.e d = z9.d.d(g0Var, wVar);
            if (d != null && d.f2095a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, d.f2096b);
            }
        }
        return false;
    }
}
