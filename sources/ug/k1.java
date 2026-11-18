package ug;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bk0;
public final class k1 extends bk0 {
    public final v0 f58726c;

    public k1(v0 v0Var) {
        this.f58726c = v0Var;
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
        v0 v0Var = this.f58726c;
        ArrayList arrayList = v0Var.f58784f3;
        if (arrayList.isEmpty()) {
            return;
        }
        m1 m1Var = (m1) f1Var.f59122a;
        m1Var.f58771r = (TLRPC.Document) arrayList.get(i7 % arrayList.size());
        m1Var.f58772s = true;
        m1Var.a(true ^ v0Var.f58788k3, false, false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        m1 m1Var = new m1(this.f58726c, viewGroup.getContext());
        m1Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(m1Var);
    }
}
