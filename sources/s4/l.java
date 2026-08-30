package s4;

import android.net.Uri;
import j3.n0;
import java.util.ArrayList;
import java.util.List;
import ph.j5;
import s8.v;
public final class l extends m {
    public final j f44020n;
    public final j5 f44021r;

    public l(n0 n0Var, v vVar, r rVar, ArrayList arrayList, List list, List list2) {
        super(n0Var, vVar, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) vVar.get(0)).f43983a);
        long j10 = rVar.e;
        if (j10 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j10, null);
        }
        this.f44020n = jVar;
        this.f44021r = jVar == null ? new j5(new j(0L, -1L, null), 6) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final r4.h c() {
        return this.f44021r;
    }

    @Override
    public final j d() {
        return this.f44020n;
    }
}
