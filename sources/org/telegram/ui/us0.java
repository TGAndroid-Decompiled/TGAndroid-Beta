package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class us0 extends org.telegram.ui.Components.dk0 {
    public final Context f52627c;
    public final vs0 d;

    public us0(vs0 vs0Var, Context context) {
        this.d = vs0Var;
        this.f52627c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return !((xs0) this.d.f52886n.d.get(f1Var.b())).f53943a.current;
    }

    @Override
    public final int b() {
        return this.d.f52886n.d.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        ug.n1 n1Var = (ug.n1) f1Var.f59161a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f52886n;
        xs0 xs0Var = (xs0) premiumPreviewFragment.d.get(i7);
        boolean z11 = true;
        if (i7 != b() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        n1Var.a(xs0Var, z10);
        if (premiumPreviewFragment.f43468e != i7) {
            z11 = false;
        }
        n1Var.c(z11, false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ts0 ts0Var = new ts0(this, this.f52627c);
        ts0Var.setCirclePaintProvider(new aj0(10, this, ts0Var));
        return new v4.f1(ts0Var);
    }
}
