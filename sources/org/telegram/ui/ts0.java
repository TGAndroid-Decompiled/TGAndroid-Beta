package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class ts0 extends org.telegram.ui.Components.oj0 {
    public final Context f50137c;
    public final us0 d;

    public ts0(us0 us0Var, Context context) {
        this.d = us0Var;
        this.f50137c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return !((ws0) this.d.f50493n.d.get(d1Var.b())).f51501a.current;
    }

    @Override
    public final int b() {
        return this.d.f50493n.d.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        ug.k1 k1Var = (ug.k1) d1Var.f56952a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f50493n;
        ws0 ws0Var = (ws0) premiumPreviewFragment.d.get(i7);
        boolean z10 = true;
        if (i7 != b() - 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        k1Var.a(ws0Var, z9);
        if (premiumPreviewFragment.f41609e != i7) {
            z10 = false;
        }
        k1Var.c(z10, false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ss0 ss0Var = new ss0(this, this.f50137c);
        ss0Var.setCirclePaintProvider(new lk0(7, this, ss0Var));
        return new v4.d1(ss0Var);
    }
}
