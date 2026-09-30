package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
import ki.w;
public final class a implements t {
    public final c f40764a;

    public a(c cVar) {
        this.f40764a = cVar;
    }

    @Override
    public final void a() {
        this.f40764a.e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        b bVar;
        c cVar = this.f40764a;
        HashMap hashMap = cVar.d;
        if (cVar.f40780w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.f40779s;
            String str = d0.f7882a;
            List list = oVar.e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i11)).f40850a);
                if (bVar2 != null && elapsedRealtime < bVar2.f40769n) {
                    i10++;
                }
            }
            w wVar = new w(1, 0, cVar.f40779s.e.size(), i10);
            cVar.f40775c.getClass();
            k4.d K3 = qb.b.K3(wVar, b0Var);
            if (K3 != null && K3.f13435a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, K3.f13436b);
            }
        }
        return false;
    }
}
