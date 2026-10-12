package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
import org.telegram.ui.Wallet.m5;
public final class a implements t {
    public final c f45050a;

    public a(c cVar) {
        this.f45050a = cVar;
    }

    @Override
    public final void a() {
        this.f45050a.f45063e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        b bVar;
        c cVar = this.f45050a;
        HashMap hashMap = cVar.d;
        if (cVar.f45068w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.f45067s;
            String str = d0.f8529a;
            List list = oVar.f45149e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i11)).f45143a);
                if (bVar2 != null && elapsedRealtime < bVar2.f45056n) {
                    i10++;
                }
            }
            m5 m5Var = new m5(1, 0, cVar.f45067s.f45149e.size(), i10);
            cVar.f45062c.getClass();
            k4.d H = t7.t.H(m5Var, b0Var);
            if (H != null && H.f14619a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, H.f14620b);
            }
        }
        return false;
    }
}
