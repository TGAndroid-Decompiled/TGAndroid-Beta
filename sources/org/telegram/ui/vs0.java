package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class vs0 extends org.telegram.ui.Components.pj0 {
    public final Context f50761c;
    public final ws0 d;

    public vs0(ws0 ws0Var, Context context) {
        this.d = ws0Var;
        this.f50761c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return !((ys0) this.d.f51471n.d.get(d1Var.b())).f52182a.current;
    }

    @Override
    public final int b() {
        return this.d.f51471n.d.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        ug.k1 k1Var = (ug.k1) d1Var.f57056a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f51471n;
        ys0 ys0Var = (ys0) premiumPreviewFragment.d.get(i7);
        boolean z10 = true;
        if (i7 != b() - 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        k1Var.a(ys0Var, z9);
        if (premiumPreviewFragment.f41619e != i7) {
            z10 = false;
        }
        k1Var.c(z10, false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        us0 us0Var = new us0(this, this.f50761c);
        us0Var.setCirclePaintProvider(new nk0(7, this, us0Var));
        return new v4.d1(us0Var);
    }
}
