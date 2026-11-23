package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class vs0 extends org.telegram.ui.Components.dk0 {
    public final Context f52854c;
    public final ws0 d;

    public vs0(ws0 ws0Var, Context context) {
        this.d = ws0Var;
        this.f52854c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return !((ys0) this.d.f53450n.d.get(e1Var.b())).f54246a.current;
    }

    @Override
    public final int b() {
        return this.d.f53450n.d.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        ug.n1 n1Var = (ug.n1) e1Var.f59111a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f53450n;
        ys0 ys0Var = (ys0) premiumPreviewFragment.d.get(i7);
        boolean z11 = true;
        if (i7 != b() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        n1Var.a(ys0Var, z10);
        if (premiumPreviewFragment.f43437e != i7) {
            z11 = false;
        }
        n1Var.c(z11, false);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        us0 us0Var = new us0(this, this.f52854c);
        us0Var.setCirclePaintProvider(new aj0(10, this, us0Var));
        return new v4.e1(us0Var);
    }
}
