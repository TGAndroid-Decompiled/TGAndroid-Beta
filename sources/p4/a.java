package p4;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import d5.g0;
import java.util.HashMap;
import java.util.List;
import n2.v;

public final class a implements r {

    public final c f45360a;

    public a(c cVar) {
        this.f45360a = cVar;
    }

    @Override
    public final void a() {
        this.f45360a.f45372e.remove(this);
    }

    @Override
    public final boolean c(Uri uri, v vVar, boolean z10) {
        b bVar;
        c cVar = this.f45360a;
        HashMap map = cVar.d;
        if (cVar.f45377w == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            m mVar = cVar.f45376s;
            int i10 = g0.f4795a;
            List list = mVar.f45424e;
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                b bVar2 = (b) map.get(((l) list.get(i12)).f45418a);
                if (bVar2 != null && jElapsedRealtime < bVar2.f45366n) {
                    i11++;
                }
            }
            j0 j0Var = new j0(1, 0, cVar.f45376s.f45424e.size(), i11);
            cVar.f45371c.getClass();
            k0 k0VarX3 = ab.a.x3(j0Var, vVar);
            if (k0VarX3 != null && k0VarX3.f2999a == 2 && (bVar = (b) map.get(uri)) != null) {
                b.a(bVar, k0VarX3.f3000b);
            }
        }
        return false;
    }
}
