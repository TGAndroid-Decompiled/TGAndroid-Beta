package sg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hm0;
public final class n1 extends hm0 {
    public final t0 f46355c;

    public n1(t0 t0Var) {
        this.f46355c = t0Var;
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
        t0 t0Var = this.f46355c;
        ArrayList arrayList = t0Var.V2;
        if (arrayList.isEmpty()) {
            return;
        }
        p1 p1Var = (p1) b1Var.f45912a;
        p1Var.f46373r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        p1Var.f46374s = true;
        p1Var.a(true ^ t0Var.f46388a3, false, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(this.f46355c, viewGroup.getContext());
        p1Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(p1Var);
    }
}
