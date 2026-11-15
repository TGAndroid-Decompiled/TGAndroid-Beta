package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class qs0 extends org.telegram.ui.Components.tj0 {
    public final Context f50788c;
    public final rs0 d;

    public qs0(rs0 rs0Var, Context context) {
        this.d = rs0Var;
        this.f50788c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return !((ts0) this.d.f51020n.d.get(e1Var.b())).f51665a.current;
    }

    @Override
    public final int b() {
        return this.d.f51020n.d.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        ug.l1 l1Var = (ug.l1) e1Var.f58535a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f51020n;
        ts0 ts0Var = (ts0) premiumPreviewFragment.d.get(i7);
        boolean z11 = true;
        if (i7 != b() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        l1Var.a(ts0Var, z10);
        if (premiumPreviewFragment.f42982e != i7) {
            z11 = false;
        }
        l1Var.c(z11, false);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        ps0 ps0Var = new ps0(this, this.f50788c);
        ps0Var.setCirclePaintProvider(new xi0(11, this, ps0Var));
        return new v4.e1(ps0Var);
    }
}
