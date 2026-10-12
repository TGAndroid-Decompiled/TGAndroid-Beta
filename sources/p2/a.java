package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e2.d0;
import java.util.HashMap;
import java.util.List;
import org.telegram.ui.Wallet.m5;
public final class a implements u {
    public final d f45042a;

    public a(d dVar) {
        this.f45042a = dVar;
    }

    @Override
    public final void a() {
        this.f45042a.f45058e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        c cVar;
        d dVar = this.f45042a;
        HashMap hashMap = dVar.d;
        if (dVar.f45063w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            p pVar = dVar.f45062s;
            String str = d0.f8529a;
            List list = pVar.f45144e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                c cVar2 = (c) hashMap.get(((o) list.get(i11)).f45138a);
                if (cVar2 != null && elapsedRealtime < cVar2.f45051n) {
                    i10++;
                }
            }
            m5 m5Var = new m5(1, 0, dVar.f45062s.f45144e.size(), i10);
            dVar.f45057c.getClass();
            k4.d H = t7.t.H(m5Var, b0Var);
            if (H != null && H.f14618a == 2 && (cVar = (c) hashMap.get(uri)) != null) {
                c.a(cVar, H.f14619b);
            }
        }
        return false;
    }
}
