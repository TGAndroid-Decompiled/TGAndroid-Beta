package zf;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.hs;
import org.telegram.messenger.pz;
import org.telegram.messenger.vs;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.nb1;
import org.telegram.ui.tx;
import org.telegram.ui.zx;
public final class j0 implements u1, tx {
    public final vs f55558a;
    public final Serializable f55559b;

    public j0(vs vsVar, Serializable serializable) {
        this.f55558a = vsVar;
        this.f55559b = serializable;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean O(zx zxVar) {
        return false;
    }

    @Override
    public void h(x1 x1Var, int i10) {
        x0 x0Var = (x0) this.f55558a;
        x0Var.getClass();
        ((boolean[]) this.f55559b)[0] = true;
        x0Var.Q();
    }

    @Override
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        mg.c1 c1Var = (mg.c1) this.f55558a;
        String str = (String) this.f55559b;
        long j10 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            j10 = ((hs) arrayList.get(i12)).f16109a;
            c1Var.f26727o1.getSendMessagesHelper().r0(pz.b(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
        }
        zxVar.finishFragment();
        mg.p.h(j10);
        return true;
    }
}
