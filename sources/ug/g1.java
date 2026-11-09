package ug;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pj0;
public final class g1 extends pj0 {
    public final s0 f56605c;

    public g1(s0 s0Var) {
        this.f56605c = s0Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        s0 s0Var = this.f56605c;
        ArrayList arrayList = s0Var.f56659e3;
        if (arrayList.isEmpty()) {
            return;
        }
        i1 i1Var = (i1) d1Var.f57056a;
        i1Var.f56647r = (TLRPC.Document) arrayList.get(i7 % arrayList.size());
        i1Var.f56648s = true;
        i1Var.a(true ^ s0Var.j3, false, false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        i1 i1Var = new i1(this.f56605c, viewGroup.getContext());
        i1Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(i1Var);
    }
}
