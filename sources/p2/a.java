package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
public final class a implements t {
    public final c f43667a;

    public a(c cVar) {
        this.f43667a = cVar;
    }

    @Override
    public final void a() {
        this.f43667a.f43680e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        b bVar;
        c cVar = this.f43667a;
        HashMap hashMap = cVar.d;
        if (cVar.f43685w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.f43684s;
            String str = d0.f8765a;
            List list = oVar.f43766e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i11)).f43760a);
                if (bVar2 != null && elapsedRealtime < bVar2.f43673n) {
                    i10++;
                }
            }
            y2.g gVar = new y2.g(1, 0, cVar.f43684s.f43766e.size(), i10);
            cVar.f43679c.getClass();
            k4.d K3 = rb.a.K3(gVar, b0Var);
            if (K3 != null && K3.f14757a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, K3.f14758b);
            }
        }
        return false;
    }
}
