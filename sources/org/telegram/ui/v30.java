package org.telegram.ui;

import android.content.Context;
public final class v30 extends org.telegram.ui.Components.voip.r {
    public final int h = 1;
    public final org.telegram.ui.Components.oj0 f50568n;

    public v30(f40 f40Var, Context context) {
        super(context, true);
        this.f50568n = f40Var;
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                c40 c40Var = ((w30) this.f50568n).M;
                if (c40Var.H1.getVisibility() == 0 && c40Var.G4) {
                    c40.J0(c40Var, this, true);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                f40 f40Var = (f40) this.f50568n;
                if (f40Var.f45479r && getParticipant() != null) {
                    f40Var.E(this, true);
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
                c40.J0(((w30) this.f50568n).M, this, false);
                return;
            default:
                super.onDetachedFromWindow();
                ((f40) this.f50568n).E(this, false);
                return;
        }
    }

    public v30(w30 w30Var, Context context) {
        super(context, false);
        this.f50568n = w30Var;
    }
}
