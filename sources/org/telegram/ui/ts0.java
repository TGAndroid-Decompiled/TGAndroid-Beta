package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class ts0 extends org.telegram.ui.Components.dk0 {
    public final Context f52470c;
    public final us0 d;

    public ts0(us0 us0Var, Context context) {
        this.d = us0Var;
        this.f52470c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return !((ws0) this.d.f52725n.d.get(f1Var.b())).f53748a.current;
    }

    @Override
    public final int b() {
        return this.d.f52725n.d.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        ug.n1 n1Var = (ug.n1) f1Var.f59245a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f52725n;
        ws0 ws0Var = (ws0) premiumPreviewFragment.d.get(i7);
        boolean z11 = true;
        if (i7 != b() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        n1Var.a(ws0Var, z10);
        if (premiumPreviewFragment.f43553e != i7) {
            z11 = false;
        }
        n1Var.c(z11, false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ss0 ss0Var = new ss0(this, this.f52470c);
        ss0Var.setCirclePaintProvider(new yi0(10, this, ss0Var));
        return new v4.f1(ss0Var);
    }
}
