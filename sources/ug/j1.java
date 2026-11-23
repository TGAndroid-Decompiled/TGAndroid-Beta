package ug;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
public final class j1 extends dk0 {
    public final u0 f58721c;

    public j1(u0 u0Var) {
        this.f58721c = u0Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final int b() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        u0 u0Var = this.f58721c;
        ArrayList arrayList = u0Var.f58787f3;
        if (arrayList.isEmpty()) {
            return;
        }
        l1 l1Var = (l1) e1Var.f59111a;
        l1Var.f58769r = (TLRPC.Document) arrayList.get(i7 % arrayList.size());
        l1Var.f58770s = true;
        l1Var.a(true ^ u0Var.f58791k3, false, false);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        l1 l1Var = new l1(this.f58721c, viewGroup.getContext());
        l1Var.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(l1Var);
    }
}
