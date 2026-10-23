package sg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lm0;
public final class n1 extends lm0 {
    public final s0 f46791c;

    public n1(s0 s0Var) {
        this.f46791c = s0Var;
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
        s0 s0Var = this.f46791c;
        ArrayList arrayList = s0Var.Y2;
        if (arrayList.isEmpty()) {
            return;
        }
        p1 p1Var = (p1) b1Var.f46343a;
        p1Var.f46815r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        p1Var.f46816s = true;
        p1Var.a(true ^ s0Var.f46825d3, false, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(this.f46791c, viewGroup.getContext());
        p1Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(p1Var);
    }
}
