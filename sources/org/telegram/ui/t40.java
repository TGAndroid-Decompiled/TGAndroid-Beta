package org.telegram.ui;

import android.content.Context;
public final class t40 extends org.telegram.ui.Components.voip.k {
    public final int h = 1;
    public final org.telegram.ui.Components.tk0 f41533n;

    public t40(d50 d50Var, Context context) {
        super(context, true);
        this.f41533n = d50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                a50 a50Var = ((u40) this.f41533n).M;
                if (a50Var.H1.getVisibility() == 0 && a50Var.G4) {
                    a50.J0(a50Var, this, true);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                d50 d50Var = (d50) this.f41533n;
                if (d50Var.f36490r && getParticipant() != null) {
                    d50Var.E(this, true);
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
                a50.J0(((u40) this.f41533n).M, this, false);
                return;
            default:
                super.onDetachedFromWindow();
                ((d50) this.f41533n).E(this, false);
                return;
        }
    }

    public t40(u40 u40Var, Context context) {
        super(context, false);
        this.f41533n = u40Var;
    }
}
