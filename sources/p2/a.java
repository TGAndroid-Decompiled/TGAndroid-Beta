package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
public final class a implements t {
    public final c f43641a;

    public a(c cVar) {
        this.f43641a = cVar;
    }

    @Override
    public final void a() {
        this.f43641a.f43654e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        b bVar;
        c cVar = this.f43641a;
        HashMap hashMap = cVar.d;
        if (cVar.f43659w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.f43658s;
            String str = d0.f8737a;
            List list = oVar.f43740e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i11)).f43734a);
                if (bVar2 != null && elapsedRealtime < bVar2.f43647n) {
                    i10++;
                }
            }
            y2.g gVar = new y2.g(1, 0, cVar.f43658s.f43740e.size(), i10);
            cVar.f43653c.getClass();
            k4.d K3 = rb.a.K3(gVar, b0Var);
            if (K3 != null && K3.f14731a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, K3.f14732b);
            }
        }
        return false;
    }
}
