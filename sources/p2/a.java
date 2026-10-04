package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
import ki.w;
public final class a implements t {
    public final c f43989a;

    public a(c cVar) {
        this.f43989a = cVar;
    }

    @Override
    public final void a() {
        this.f43989a.f44002e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        b bVar;
        c cVar = this.f43989a;
        HashMap hashMap = cVar.d;
        if (cVar.f44007w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.f44006s;
            String str = d0.f8538a;
            List list = oVar.f44088e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i11)).f44082a);
                if (bVar2 != null && elapsedRealtime < bVar2.f43995n) {
                    i10++;
                }
            }
            w wVar = new w(1, 0, cVar.f44006s.f44088e.size(), i10);
            cVar.f44001c.getClass();
            k4.d K3 = qb.b.K3(wVar, b0Var);
            if (K3 != null && K3.f14590a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, K3.f14591b);
            }
        }
        return false;
    }
}
