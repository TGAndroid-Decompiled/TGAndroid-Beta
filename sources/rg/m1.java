package rg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pm0;
public final class m1 extends pm0 {
    public final s0 f47349c;

    public m1(s0 s0Var) {
        this.f47349c = s0Var;
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
        s0 s0Var = this.f47349c;
        ArrayList arrayList = s0Var.V2;
        if (arrayList.isEmpty()) {
            return;
        }
        o1 o1Var = (o1) d1Var.f47658a;
        o1Var.f47374r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        o1Var.f47375s = true;
        o1Var.a(true ^ s0Var.f47390a3, false, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        o1 o1Var = new o1(this.f47349c, viewGroup.getContext());
        o1Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(o1Var);
    }
}
