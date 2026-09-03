package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class uw0 extends org.telegram.ui.Components.ql0 {
    public final Context f38923c;
    public final vw0 d;

    public uw0(vw0 vw0Var, Context context) {
        this.d = vw0Var;
        this.f38923c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return !((xw0) this.d.f39214n.d.get(l1Var.b())).f40084a.current;
    }

    @Override
    public final int h() {
        return this.d.f39214n.d.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        eg.k2 k2Var = (eg.k2) l1Var.f5774a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f39214n;
        xw0 xw0Var = (xw0) premiumPreviewFragment.d.get(i10);
        boolean z10 = true;
        if (i10 != h() - 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        k2Var.a(xw0Var, z4);
        if (premiumPreviewFragment.e != i10) {
            z10 = false;
        }
        k2Var.c(z10, false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        tw0 tw0Var = new tw0(this, this.f38923c);
        tw0Var.setCirclePaintProvider(new vl0(10, this, tw0Var));
        return new f2.l1(tw0Var);
    }
}
