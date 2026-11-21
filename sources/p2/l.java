package p2;

import android.net.Uri;
import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.jn;
public final class l extends m {
    public final j f55164n;
    public final jn f55165r;

    public l(u uVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) i0Var.get(0)).f55122a);
        long j3 = rVar.f55181e;
        if (j3 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, null, j3);
        }
        this.f55164n = jVar;
        this.f55165r = jVar == null ? new jn(new j(0L, null, -1L), 8) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final o2.i c() {
        return this.f55165r;
    }

    @Override
    public final j d() {
        return this.f55164n;
    }
}
