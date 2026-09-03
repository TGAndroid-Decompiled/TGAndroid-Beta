package s4;

import android.net.Uri;
import j3.n0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.ai;
import s8.v;
public final class l extends m {
    public final j f47017n;
    public final ai f47018r;

    public l(n0 n0Var, v vVar, r rVar, ArrayList arrayList, List list, List list2) {
        super(n0Var, vVar, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) vVar.get(0)).f46976a);
        long j10 = rVar.f47034e;
        if (j10 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j10, null);
        }
        this.f47017n = jVar;
        this.f47018r = jVar == null ? new ai(new j(0L, -1L, null), 13) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final r4.h c() {
        return this.f47018r;
    }

    @Override
    public final j d() {
        return this.f47017n;
    }
}
