package org.telegram.ui;

import android.content.Context;
public final class x30 extends org.telegram.ui.Components.voip.r {
    public final int h = 1;
    public final org.telegram.ui.Components.pj0 f51537n;

    public x30(h40 h40Var, Context context) {
        super(context, true);
        this.f51537n = h40Var;
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                e40 e40Var = ((y30) this.f51537n).M;
                if (e40Var.H1.getVisibility() == 0 && e40Var.G4) {
                    e40.J0(e40Var, this, true);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                h40 h40Var = (h40) this.f51537n;
                if (h40Var.f46143r && getParticipant() != null) {
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
                e40.J0(((y30) this.f51537n).M, this, false);
                return;
            default:
                super.onDetachedFromWindow();
                ((h40) this.f51537n).E(this, false);
                return;
        }
    }

    public x30(y30 y30Var, Context context) {
        super(context, false);
        this.f51537n = y30Var;
    }
}
