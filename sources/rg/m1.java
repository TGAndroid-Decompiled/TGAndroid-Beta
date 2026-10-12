package rg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vm0;
public final class m1 extends vm0 {
    public final t0 f47563c;

    public m1(t0 t0Var) {
        this.f47563c = t0Var;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        t0 t0Var = this.f47563c;
        ArrayList arrayList = t0Var.V2;
        if (arrayList.isEmpty()) {
            return;
        }
        o1 o1Var = (o1) d1Var.f47889a;
        o1Var.f47588r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        o1Var.f47589s = true;
        o1Var.a(true ^ t0Var.f47595a3, false, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        o1 o1Var = new o1(this.f47563c, viewGroup.getContext());
        o1Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(o1Var);
    }
}
