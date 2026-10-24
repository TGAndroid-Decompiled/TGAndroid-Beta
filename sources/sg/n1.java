package sg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.km0;
public final class n1 extends km0 {
    public final s0 f46790c;

    public n1(s0 s0Var) {
        this.f46790c = s0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        s0 s0Var = this.f46790c;
        ArrayList arrayList = s0Var.Y2;
        if (arrayList.isEmpty()) {
            return;
        }
        p1 p1Var = (p1) b1Var.f46342a;
        p1Var.f46814r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        p1Var.f46815s = true;
        p1Var.a(true ^ s0Var.f46824d3, false, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(this.f46790c, viewGroup.getContext());
        p1Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(p1Var);
    }
}
