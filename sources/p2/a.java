package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
public final class a implements t {
    public final c f43640a;

    public a(c cVar) {
        this.f43640a = cVar;
    }

    @Override
    public final void a() {
        this.f43640a.f43653e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        b bVar;
        c cVar = this.f43640a;
        HashMap hashMap = cVar.d;
        if (cVar.f43658w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.f43657s;
            String str = d0.f8737a;
            List list = oVar.f43739e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i11)).f43733a);
                if (bVar2 != null && elapsedRealtime < bVar2.f43646n) {
                    i10++;
                }
            }
            y2.g gVar = new y2.g(1, 0, cVar.f43657s.f43739e.size(), i10);
            cVar.f43652c.getClass();
            k4.d K3 = rb.a.K3(gVar, b0Var);
            if (K3 != null && K3.f14731a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, K3.f14732b);
            }
        }
        return false;
    }
}
