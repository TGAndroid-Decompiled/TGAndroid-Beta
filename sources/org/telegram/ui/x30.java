package org.telegram.ui;

import android.content.Context;
public final class x30 extends org.telegram.ui.Components.voip.s {
    public final int h = 1;
    public final org.telegram.ui.Components.dk0 f53835n;

    public x30(h40 h40Var, Context context) {
        super(context, true);
        this.f53835n = h40Var;
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                e40 e40Var = ((y30) this.f53835n).N;
                if (e40Var.L1.getVisibility() == 0 && e40Var.O4) {
                    e40.K0(e40Var, this, true);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                h40 h40Var = (h40) this.f53835n;
                if (h40Var.f48425r && getParticipant() != null) {
                    h40Var.E(this, true);
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
                e40.K0(((y30) this.f53835n).N, this, false);
                return;
            default:
                super.onDetachedFromWindow();
                ((h40) this.f53835n).E(this, false);
                return;
        }
    }

    public x30(y30 y30Var, Context context) {
        super(context, false);
        this.f53835n = y30Var;
    }
}
