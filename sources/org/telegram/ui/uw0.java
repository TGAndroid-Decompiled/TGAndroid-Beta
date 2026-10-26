package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class uw0 extends org.telegram.ui.Components.lm0 {
    public final Context f44544c;
    public final vw0 d;

    public uw0(vw0 vw0Var, Context context) {
        this.d = vw0Var;
        this.f44544c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return !((xw0) this.d.f44917n.d.get(e1Var.b())).f45891a.current;
    }

    @Override
    public final int h() {
        return this.d.f44917n.d.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        tg.r1 r1Var = (tg.r1) e1Var.f47738a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f44917n;
        xw0 xw0Var = (xw0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        r1Var.a(xw0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        r1Var.c(z11, false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        tw0 tw0Var = new tw0(this, this.f44544c);
        tw0Var.setCirclePaintProvider(new af0(13, this, tw0Var));
        return new s4.e1(tw0Var);
    }
}
