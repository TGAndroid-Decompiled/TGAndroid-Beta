package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class ws0 extends org.telegram.ui.Components.oj0 {
    public final Context f51431c;
    public final xs0 d;

    public ws0(xs0 xs0Var, Context context) {
        this.d = xs0Var;
        this.f51431c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return !((zs0) this.d.f51812n.d.get(d1Var.b())).f52526a.current;
    }

    @Override
    public final int b() {
        return this.d.f51812n.d.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        ug.k1 k1Var = (ug.k1) d1Var.f57052a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f51812n;
        zs0 zs0Var = (zs0) premiumPreviewFragment.d.get(i7);
        boolean z10 = true;
        if (i7 != b() - 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        k1Var.a(zs0Var, z9);
        if (premiumPreviewFragment.f41610e != i7) {
            z10 = false;
        }
        k1Var.c(z10, false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        vs0 vs0Var = new vs0(this, this.f51431c);
        vs0Var.setCirclePaintProvider(new ok0(7, this, vs0Var));
        return new v4.d1(vs0Var);
    }
}
