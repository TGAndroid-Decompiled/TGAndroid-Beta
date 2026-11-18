package org.telegram.ui;

import android.content.Context;
public final class y30 extends org.telegram.ui.Components.voip.r {
    public final int h = 1;
    public final org.telegram.ui.Components.bk0 f53981n;

    public y30(i40 i40Var, Context context) {
        super(context, true);
        this.f53981n = i40Var;
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                f40 f40Var = ((z30) this.f53981n).N;
                if (f40Var.L1.getVisibility() == 0 && f40Var.O4) {
                    f40.K0(f40Var, this, true);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                i40 i40Var = (i40) this.f53981n;
                if (i40Var.f48534r && getParticipant() != null) {
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
                f40.K0(((z30) this.f53981n).N, this, false);
                return;
            default:
                super.onDetachedFromWindow();
                ((i40) this.f53981n).E(this, false);
                return;
        }
    }

    public y30(z30 z30Var, Context context) {
        super(context, false);
        this.f53981n = z30Var;
    }
}
