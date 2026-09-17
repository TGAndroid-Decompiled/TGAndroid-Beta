package sg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kl0;
public final class p1 extends kl0 {
    public final u0 f46225c;

    public p1(u0 u0Var) {
        this.f46225c = u0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        u0 u0Var = this.f46225c;
        ArrayList arrayList = u0Var.X2;
        if (arrayList.isEmpty()) {
            return;
        }
        r1 r1Var = (r1) c1Var.f45739a;
        r1Var.f46253r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        r1Var.f46254s = true;
        r1Var.a(true ^ u0Var.f46270c3, false, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        r1 r1Var = new r1(this.f46225c, viewGroup.getContext());
        r1Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(r1Var);
    }
}
