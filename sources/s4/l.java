package s4;

import android.net.Uri;
import j3.n0;
import java.util.ArrayList;
import java.util.List;
import s8.v;
public final class l extends m {
    public final j f44085n;
    public final o2.i f44086r;

    public l(n0 n0Var, v vVar, r rVar, ArrayList arrayList, List list, List list2) {
        super(n0Var, vVar, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) vVar.get(0)).f44048a);
        long j10 = rVar.e;
        if (j10 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j10, null);
        }
        this.f44085n = jVar;
        this.f44086r = jVar == null ? new o2.i(new j(0L, -1L, null), 17) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final r4.h c() {
        return this.f44086r;
    }

    @Override
    public final j d() {
        return this.f44085n;
    }
}
