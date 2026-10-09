package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
import ki.x;
public final class a implements t {
    public final c f45162a;

    public a(c cVar) {
        this.f45162a = cVar;
    }

    @Override
    public final void a() {
        this.f45162a.f45175e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        b bVar;
        c cVar = this.f45162a;
        HashMap hashMap = cVar.d;
        if (cVar.f45180w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.f45179s;
            String str = d0.f8532a;
            List list = oVar.f45261e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i11)).f45255a);
                if (bVar2 != null && elapsedRealtime < bVar2.f45168n) {
                    i10++;
                }
            }
            x xVar = new x(1, 0, cVar.f45179s.f45261e.size(), i10);
            cVar.f45174c.getClass();
            k4.d l32 = rb.a.l3(xVar, b0Var);
            if (l32 != null && l32.f14622a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, l32.f14623b);
            }
        }
        return false;
    }
}
