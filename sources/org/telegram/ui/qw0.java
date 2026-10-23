package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class qw0 extends org.telegram.ui.Components.lm0 {
    public final Context f40925c;
    public final rw0 d;

    public qw0(rw0 rw0Var, Context context) {
        this.d = rw0Var;
        this.f40925c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return !((tw0) this.d.f41263n.d.get(b1Var.b())).f42089a.current;
    }

    @Override
    public final int h() {
        return this.d.f41263n.d.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        sg.r1 r1Var = (sg.r1) b1Var.f46343a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f41263n;
        tw0 tw0Var = (tw0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        r1Var.a(tw0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        r1Var.c(z11, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        pw0 pw0Var = new pw0(this, this.f40925c);
        pw0Var.setCirclePaintProvider(new ql0(9, this, pw0Var));
        return new s4.b1(pw0Var);
    }
}
