package p4;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import d5.f0;
import java.util.HashMap;
import java.util.List;
import n2.w;
public final class a implements r {
    public final c f45354a;

    public a(c cVar) {
        this.f45354a = cVar;
    }

    @Override
    public final void a() {
        this.f45354a.f45366e.remove(this);
    }

    @Override
    public final boolean c(Uri uri, w wVar, boolean z10) {
        b bVar;
        c cVar = this.f45354a;
        HashMap hashMap = cVar.d;
        if (cVar.f45371w == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m mVar = cVar.f45370s;
            int i9 = f0.f4349a;
            List list = mVar.f45418e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                b bVar2 = (b) hashMap.get(((l) list.get(i11)).f45412a);
                if (bVar2 != null && elapsedRealtime < bVar2.f45360n) {
                    i10++;
                }
            }
            j0 j0Var = new j0(1, 0, cVar.f45370s.f45418e.size(), i10);
            cVar.f45365c.getClass();
            k0 k32 = v9.d.k3(j0Var, wVar);
            if (k32 != null && k32.f2562a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, k32.f2563b);
            }
        }
        return false;
    }
}
