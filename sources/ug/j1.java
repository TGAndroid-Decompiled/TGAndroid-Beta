package ug;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
public final class j1 extends dk0 {
    public final u0 f58756c;

    public j1(u0 u0Var) {
        this.f58756c = u0Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        u0 u0Var = this.f58756c;
        ArrayList arrayList = u0Var.f58822f3;
        if (arrayList.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) f1Var.f59165a;
        l1Var.f58804r = (TLRPC.Document) arrayList.get(i7 % arrayList.size());
        l1Var.f58805s = true;
        l1Var.a(true ^ u0Var.f58826k3, false, false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        l1 l1Var = new l1(this.f58756c, viewGroup.getContext());
        l1Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(l1Var);
    }
}
