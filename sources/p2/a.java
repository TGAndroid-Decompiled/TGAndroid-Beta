package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
public final class a implements t {
    public final c f43668a;

    public a(c cVar) {
        this.f43668a = cVar;
    }

    @Override
    public final void a() {
        this.f43668a.f43681e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        b bVar;
        c cVar = this.f43668a;
        HashMap hashMap = cVar.d;
        if (cVar.f43686w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.f43685s;
            String str = d0.f8765a;
            List list = oVar.f43767e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i11)).f43761a);
                if (bVar2 != null && elapsedRealtime < bVar2.f43674n) {
                    i10++;
                }
            }
            y2.g gVar = new y2.g(1, 0, cVar.f43685s.f43767e.size(), i10);
            cVar.f43680c.getClass();
            k4.d K3 = rb.a.K3(gVar, b0Var);
            if (K3 != null && K3.f14757a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, K3.f14758b);
            }
        }
        return false;
    }
}
