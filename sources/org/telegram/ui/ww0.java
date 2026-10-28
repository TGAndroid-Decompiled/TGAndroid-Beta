package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class ww0 extends org.telegram.ui.Components.mm0 {
    public final Context f45412c;
    public final xw0 d;

    public ww0(xw0 xw0Var, Context context) {
        this.d = xw0Var;
        this.f45412c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return !((zw0) this.d.f45792n.d.get(e1Var.b())).f46395a.current;
    }

    @Override
    public final int h() {
        return this.d.f45792n.d.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        tg.r1 r1Var = (tg.r1) e1Var.f47773a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f45792n;
        zw0 zw0Var = (zw0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        r1Var.a(zw0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        r1Var.c(z11, false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        vw0 vw0Var = new vw0(this, this.f45412c);
        vw0Var.setCirclePaintProvider(new cf0(13, this, vw0Var));
        return new s4.e1(vw0Var);
    }
}
