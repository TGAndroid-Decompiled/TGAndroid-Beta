package p2;

import android.net.Uri;
import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ou;
public final class l extends m {
    public final j f54554n;
    public final ou f54555r;

    public l(u uVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) i0Var.get(0)).f54512a);
        long j3 = rVar.f54571e;
        if (j3 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, null, j3);
        }
        this.f54554n = jVar;
        this.f54555r = jVar == null ? new ou(new j(0L, null, -1L), 14) : null;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final o2.i c() {
        return this.f54555r;
    }

    @Override
    public final j d() {
        return this.f54554n;
    }
}
