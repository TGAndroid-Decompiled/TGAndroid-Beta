package ug;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tj0;
public final class h1 extends tj0 {
    public final t0 f58116c;

    public h1(t0 t0Var) {
        this.f58116c = t0Var;
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
        t0 t0Var = this.f58116c;
        ArrayList arrayList = t0Var.f58178f3;
        if (arrayList.isEmpty()) {
            return;
        }
        j1 j1Var = (j1) e1Var.f58535a;
        j1Var.f58161r = (TLRPC.Document) arrayList.get(i7 % arrayList.size());
        j1Var.f58162s = true;
        j1Var.a(true ^ t0Var.f58182k3, false, false);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        j1 j1Var = new j1(this.f58116c, viewGroup.getContext());
        j1Var.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(j1Var);
    }
}
