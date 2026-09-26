package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
import ki.w;
public final class a implements t {
    public final c f40665a;

    public a(c cVar) {
        this.f40665a = cVar;
    }

    @Override
    public final void a() {
        this.f40665a.e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        b bVar;
        c cVar = this.f40665a;
        HashMap hashMap = cVar.d;
        if (cVar.f40681w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.f40680s;
            String str = d0.f7870a;
            List list = oVar.e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i11)).f40751a);
                if (bVar2 != null && elapsedRealtime < bVar2.f40670n) {
                    i10++;
                }
            }
            w wVar = new w(1, 0, cVar.f40680s.e.size(), i10);
            cVar.f40676c.getClass();
            k4.d K3 = qb.b.K3(wVar, b0Var);
            if (K3 != null && K3.f13420a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, K3.f13421b);
            }
        }
        return false;
    }
}
