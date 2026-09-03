package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class uw0 extends org.telegram.ui.Components.rl0 {
    public final Context f41948c;
    public final vw0 d;

    public uw0(vw0 vw0Var, Context context) {
        this.d = vw0Var;
        this.f41948c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return !((xw0) this.d.f42226n.d.get(m1Var.b())).f43466a.current;
    }

    @Override
    public final int h() {
        return this.d.f42226n.d.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        fg.j2 j2Var = (fg.j2) m1Var.f5875a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f42226n;
        xw0 xw0Var = (xw0) premiumPreviewFragment.d.get(i10);
        boolean z10 = true;
        if (i10 != h() - 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        j2Var.a(xw0Var, z4);
        if (premiumPreviewFragment.f34487e != i10) {
            z10 = false;
        }
        j2Var.c(z10, false);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        tw0 tw0Var = new tw0(this, this.f41948c);
        tw0Var.setCirclePaintProvider(new vl0(10, this, tw0Var));
        return new f2.m1(tw0Var);
    }
}
