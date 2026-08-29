package r4;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import f5.d0;
import f7.v;
import java.util.HashMap;
import java.util.List;
import p2.u;
public final class a implements r {
    public final c f46935a;

    public a(c cVar) {
        this.f46935a = cVar;
    }

    @Override
    public final void a() {
        this.f46935a.f46947e.remove(this);
    }

    @Override
    public final boolean c(Uri uri, u uVar, boolean z10) {
        b bVar;
        c cVar = this.f46935a;
        HashMap hashMap = cVar.d;
        if (cVar.f46952w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m mVar = cVar.f46951s;
            int i10 = d0.f6579a;
            List list = mVar.f46999e;
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                b bVar2 = (b) hashMap.get(((l) list.get(i12)).f46993a);
                if (bVar2 != null && elapsedRealtime < bVar2.f46941n) {
                    i11++;
                }
            }
            j0 j0Var = new j0(1, 0, cVar.f46951s.f46999e.size(), i11);
            cVar.f46946c.getClass();
            k0 z11 = v.z(j0Var, uVar);
            if (z11 != null && z11.f3576a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, z11.f3577b);
            }
        }
        return false;
    }
}
