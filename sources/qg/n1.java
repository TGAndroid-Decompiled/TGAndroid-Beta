package qg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ul0;
public final class n1 extends ul0 {
    public final v0 f40844c;

    public n1(v0 v0Var) {
        this.f40844c = v0Var;
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
        v0 v0Var = this.f40844c;
        ArrayList arrayList = v0Var.X2;
        if (arrayList.isEmpty()) {
            return;
        }
        p1 p1Var = (p1) c1Var.f41610a;
        p1Var.f40861r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        p1Var.f40862s = true;
        p1Var.a(true ^ v0Var.f40870c3, false, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(this.f40844c, viewGroup.getContext());
        p1Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(p1Var);
    }
}
