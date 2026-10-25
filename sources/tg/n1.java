package tg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lm0;
public final class n1 extends lm0 {
    public final s0 f48966c;

    public n1(s0 s0Var) {
        this.f48966c = s0Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final int h() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        s0 s0Var = this.f48966c;
        ArrayList arrayList = s0Var.f48997f3;
        if (arrayList.isEmpty()) {
            return;
        }
        p1 p1Var = (p1) e1Var.f47735a;
        p1Var.f48990r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        p1Var.f48991s = true;
        p1Var.a(true ^ s0Var.f49002k3, false, false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(this.f48966c, viewGroup.getContext());
        p1Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(p1Var);
    }
}
