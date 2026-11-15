package org.telegram.ui;

import android.content.Context;
public final class v30 extends org.telegram.ui.Components.voip.r {
    public final int h = 1;
    public final org.telegram.ui.Components.tj0 f52111n;

    public v30(f40 f40Var, Context context) {
        super(context, true);
        this.f52111n = f40Var;
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                c40 c40Var = ((w30) this.f52111n).N;
                if (c40Var.L1.getVisibility() == 0 && c40Var.O4) {
                    c40.J0(c40Var, this, true);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                f40 f40Var = (f40) this.f52111n;
                if (f40Var.f46996r && getParticipant() != null) {
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
                c40.J0(((w30) this.f52111n).N, this, false);
                return;
            default:
                super.onDetachedFromWindow();
                ((f40) this.f52111n).E(this, false);
                return;
        }
    }

    public v30(w30 w30Var, Context context) {
        super(context, false);
        this.f52111n = w30Var;
    }
}
