package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class ss0 extends org.telegram.ui.Components.oj0 {
    public final Context f49804c;
    public final ts0 d;

    public ss0(ts0 ts0Var, Context context) {
        this.d = ts0Var;
        this.f49804c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return !((vs0) this.d.f50109n.d.get(d1Var.b())).f50813a.current;
    }

    @Override
    public final int b() {
        return this.d.f50109n.d.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        ug.k1 k1Var = (ug.k1) d1Var.f56927a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f50109n;
        vs0 vs0Var = (vs0) premiumPreviewFragment.d.get(i7);
        boolean z10 = true;
        if (i7 != b() - 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        k1Var.a(vs0Var, z9);
        if (premiumPreviewFragment.f41584e != i7) {
            z10 = false;
        }
        k1Var.c(z10, false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        rs0 rs0Var = new rs0(this, this.f49804c);
        rs0Var.setCirclePaintProvider(new lk0(7, this, rs0Var));
        return new v4.d1(rs0Var);
    }
}
