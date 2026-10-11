package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
import ki.x;
public final class a implements t {
    public final c f45196a;

    public a(c cVar) {
        this.f45196a = cVar;
    }

    @Override
    public final void a() {
        this.f45196a.f45209e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        b bVar;
        c cVar = this.f45196a;
        HashMap hashMap = cVar.d;
        if (cVar.f45214w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.f45213s;
            String str = d0.f8531a;
            List list = oVar.f45295e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i11)).f45289a);
                if (bVar2 != null && elapsedRealtime < bVar2.f45202n) {
                    i10++;
                }
            }
            x xVar = new x(1, 0, cVar.f45213s.f45295e.size(), i10);
            cVar.f45208c.getClass();
            k4.d l32 = rb.a.l3(xVar, b0Var);
            if (l32 != null && l32.f14621a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, l32.f14622b);
            }
        }
        return false;
    }
}
