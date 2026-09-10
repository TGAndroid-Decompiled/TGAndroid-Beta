package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
public final class a implements t {
    public final c f39523a;

    public a(c cVar) {
        this.f39523a = cVar;
    }

    @Override
    public final void a() {
        this.f39523a.e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        b bVar;
        c cVar = this.f39523a;
        HashMap hashMap = cVar.d;
        if (cVar.f39539w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.f39538s;
            String str = d0.f7188a;
            List list = oVar.e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i11)).f39609a);
                if (bVar2 != null && elapsedRealtime < bVar2.f39528n) {
                    i10++;
                }
            }
            y2.g gVar = new y2.g(1, 0, cVar.f39538s.e.size(), i10);
            cVar.f39534c.getClass();
            k4.d n32 = rb.a.n3(gVar, b0Var);
            if (n32 != null && n32.f12278a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, n32.f12279b);
            }
        }
        return false;
    }
}
