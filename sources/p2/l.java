package p2;

import android.net.Uri;
import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.uy;
public final class l extends m {
    public final j f53019n;
    public final uy f53020r;

    public l(u uVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) i0Var.get(0)).f52977a);
        long j3 = rVar.f53036e;
        if (j3 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, null, j3);
        }
        this.f53019n = jVar;
        this.f53020r = jVar == null ? new uy(new j(0L, null, -1L), 7) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final o2.i c() {
        return this.f53020r;
    }

    @Override
    public final j f() {
        return this.f53019n;
    }
}
