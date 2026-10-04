package rg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yl0;
public final class n1 extends yl0 {
    public final t0 f46228c;

    public n1(t0 t0Var) {
        this.f46228c = t0Var;
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
        t0 t0Var = this.f46228c;
        ArrayList arrayList = t0Var.f46264e3;
        if (arrayList.isEmpty()) {
            return;
        }
        p1 p1Var = (p1) c1Var.f46531a;
        p1Var.f46248r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        p1Var.f46249s = true;
        p1Var.a(true ^ t0Var.j3, false, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(this.f46228c, viewGroup.getContext());
        p1Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(p1Var);
    }
}
