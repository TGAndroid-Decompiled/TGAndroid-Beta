package p4;

import android.net.Uri;
import j3.t0;
import java.util.ArrayList;
import java.util.List;
import nh.d6;
import q8.z;
public final class l extends m {
    public final j f45577n;
    public final d6 f45578r;

    public l(t0 t0Var, z zVar, r rVar, ArrayList arrayList, List list, List list2) {
        super(t0Var, zVar, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) zVar.get(0)).f45536a);
        long j10 = rVar.f45594e;
        if (j10 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j10, null);
        }
        this.f45577n = jVar;
        this.f45578r = jVar == null ? new d6(new j(0L, -1L, null), 13) : null;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final o4.i c() {
        return this.f45578r;
    }

    @Override
    public final j d() {
        return this.f45577n;
    }
}
