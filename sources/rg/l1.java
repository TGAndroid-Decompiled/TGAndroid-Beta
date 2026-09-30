package rg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yl0;
public final class l1 extends yl0 {
    public final s0 f42768c;

    public l1(s0 s0Var) {
        this.f42768c = s0Var;
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
        s0 s0Var = this.f42768c;
        ArrayList arrayList = s0Var.f42794e3;
        if (arrayList.isEmpty()) {
            return;
        }
        n1 n1Var = (n1) c1Var.f43068a;
        n1Var.f42788r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        n1Var.f42789s = true;
        n1Var.a(true ^ s0Var.j3, false, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        n1 n1Var = new n1(this.f42768c, viewGroup.getContext());
        n1Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(n1Var);
    }
}
