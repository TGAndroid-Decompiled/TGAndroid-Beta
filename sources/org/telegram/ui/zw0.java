package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class zw0 extends org.telegram.ui.Components.vl0 {
    public final Context f40588c;
    public final ax0 d;

    public zw0(ax0 ax0Var, Context context) {
        this.d = ax0Var;
        this.f40588c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return !((cx0) this.d.f32253n.d.get(c1Var.b())).f32812a.current;
    }

    @Override
    public final int h() {
        return this.d.f32253n.d.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        rg.p1 p1Var = (rg.p1) c1Var.f42960a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f32253n;
        cx0 cx0Var = (cx0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        p1Var.a(cx0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        p1Var.c(z11, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        yw0 yw0Var = new yw0(this, this.f40588c);
        yw0Var.setCirclePaintProvider(new ds0(3, this, yw0Var));
        return new s4.c1(yw0Var);
    }
}
