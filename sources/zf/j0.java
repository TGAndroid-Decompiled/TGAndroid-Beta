package zf;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.oz;
import org.telegram.messenger.us;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ay;
import org.telegram.ui.pb1;
import org.telegram.ui.ux;
public final class j0 implements u1, ux {
    public final us f55540a;
    public final Serializable f55541b;

    public j0(us usVar, Serializable serializable) {
        this.f55540a = usVar;
        this.f55541b = serializable;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean N(ay ayVar) {
        return false;
    }

    @Override
    public void h(x1 x1Var, int i10) {
        x0 x0Var = (x0) this.f55540a;
        x0Var.getClass();
        ((boolean[]) this.f55541b)[0] = true;
        x0Var.Q();
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        mg.c1 c1Var = (mg.c1) this.f55540a;
        String str = (String) this.f55541b;
        long j10 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            j10 = ((gs) arrayList.get(i12)).f15760a;
            c1Var.f26669o1.getSendMessagesHelper().r0(oz.b(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
        }
        ayVar.finishFragment();
        mg.p.h(j10);
        return true;
    }
}
