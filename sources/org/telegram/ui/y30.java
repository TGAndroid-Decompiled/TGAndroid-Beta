package org.telegram.ui;

import android.content.Context;
public final class y30 extends org.telegram.ui.Components.voip.r {
    public final int h = 1;
    public final org.telegram.ui.Components.oj0 f51881n;

    public y30(i40 i40Var, Context context) {
        super(context, true);
        this.f51881n = i40Var;
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                f40 f40Var = ((z30) this.f51881n).M;
                if (f40Var.K1.getVisibility() == 0 && f40Var.J4) {
                    f40.J0(f40Var, this, true);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                i40 i40Var = (i40) this.f51881n;
                if (i40Var.f46483r && getParticipant() != null) {
                    i40Var.E(this, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.h) {
            case 0:
                super.onDetachedFromWindow();
                f40.J0(((z30) this.f51881n).M, this, false);
                return;
            default:
                super.onDetachedFromWindow();
                ((i40) this.f51881n).E(this, false);
                return;
        }
    }

    public y30(z30 z30Var, Context context) {
        super(context, false);
        this.f51881n = z30Var;
    }
}
