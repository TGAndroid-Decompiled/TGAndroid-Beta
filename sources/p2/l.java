package p2;

import android.net.Uri;
import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.nd0;
public final class l extends m {
    public final j f55249n;
    public final nd0 f55250r;

    public l(u uVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) i0Var.get(0)).f55207a);
        long j3 = rVar.f55266e;
        if (j3 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, null, j3);
        }
        this.f55249n = jVar;
        this.f55250r = jVar == null ? new nd0(new j(0L, null, -1L), 5) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final o2.i d() {
        return this.f55250r;
    }

    @Override
    public final j h() {
        return this.f55249n;
    }
}
