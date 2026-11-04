package vg;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sj0;
public final class j1 extends sj0 {
    public final r0 f56686c;

    public j1(r0 r0Var) {
        this.f56686c = r0Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        r0 r0Var = this.f56686c;
        ArrayList arrayList = r0Var.f56724f3;
        if (arrayList.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) d1Var.f55540a;
        l1Var.f56708r = (TLRPC.Document) arrayList.get(i3 % arrayList.size());
        l1Var.f56709s = true;
        l1Var.a(true ^ r0Var.f56728k3, false, false);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        l1 l1Var = new l1(this.f56686c, viewGroup.getContext());
        l1Var.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(l1Var);
    }
}
