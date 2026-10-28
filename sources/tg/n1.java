package tg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mm0;
public final class n1 extends mm0 {
    public final s0 f49004c;

    public n1(s0 s0Var) {
        this.f49004c = s0Var;
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
        s0 s0Var = this.f49004c;
        ArrayList arrayList = s0Var.f49035f3;
        if (arrayList.isEmpty()) {
            return;
        }
        p1 p1Var = (p1) e1Var.f47773a;
        p1Var.f49028r = (TLRPC.Document) arrayList.get(i10 % arrayList.size());
        p1Var.f49029s = true;
        p1Var.a(true ^ s0Var.f49040k3, false, false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        p1 p1Var = new p1(this.f49004c, viewGroup.getContext());
        p1Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(p1Var);
    }
}
