package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
import ki.z;
public final class a implements t {
    public final c f45230a;

    public a(c cVar) {
        this.f45230a = cVar;
    }

    @Override
    public final void a() {
        this.f45230a.f45243e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        b bVar;
        c cVar = this.f45230a;
        HashMap hashMap = cVar.d;
        if (cVar.f45248w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.f45247s;
            String str = d0.f8531a;
            List list = oVar.f45329e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i11)).f45323a);
                if (bVar2 != null && elapsedRealtime < bVar2.f45236n) {
                    i10++;
                }
            }
            z zVar = new z(1, 0, cVar.f45247s.f45329e.size(), i10);
            cVar.f45242c.getClass();
            k4.d l32 = rb.a.l3(zVar, b0Var);
            if (l32 != null && l32.f14621a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, l32.f14622b);
            }
        }
        return false;
    }
}
