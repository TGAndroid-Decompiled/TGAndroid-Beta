package org.telegram.ui;

import android.content.Context;
public final class u40 extends org.telegram.ui.Components.voip.k {
    public final int h = 1;
    public final org.telegram.ui.Components.sk0 f42007n;

    public u40(e50 e50Var, Context context) {
        super(context, true);
        this.f42007n = e50Var;
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                b50 b50Var = ((v40) this.f42007n).M;
                if (b50Var.H1.getVisibility() == 0 && b50Var.G4) {
                    b50.J0(b50Var, this, true);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                e50 e50Var = (e50) this.f42007n;
                if (e50Var.f36930r && getParticipant() != null) {
                    e50Var.E(this, true);
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
                b50.J0(((v40) this.f42007n).M, this, false);
                return;
            default:
                super.onDetachedFromWindow();
                ((e50) this.f42007n).E(this, false);
                return;
        }
    }

    public u40(v40 v40Var, Context context) {
        super(context, false);
        this.f42007n = v40Var;
    }
}
