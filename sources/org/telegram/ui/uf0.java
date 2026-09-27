package org.telegram.ui;

import android.content.Context;
public final class uf0 extends org.telegram.ui.Components.voip.o2 {
    public final int e;
    public final org.telegram.ui.Components.hw0 f38243f;

    public uf0(wf0 wf0Var, Context context, int i10) {
        super(wf0Var.f39282s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f38243f = wf0Var;
                super(wf0Var.f39282s0, context);
                return;
            default:
                this.f38243f = wf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((wf0) this.f38243f).f39270i0;
            case 1:
                return ((wf0) this.f38243f).f39270i0;
            default:
                return ((ue0) this.f38243f).M;
        }
    }

    @Override
    public final boolean b() {
        uf0 uf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    wf0 wf0Var = (wf0) this.f38243f;
                    if (wf0Var.V <= 0 || wf0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                wf0 wf0Var2 = (wf0) this.f38243f;
                if (isClickable() && getVisibility() == 0 && !wf0Var2.f39264d0 && (((uf0Var = wf0Var2.v) == null || uf0Var.getVisibility() == 8) && !wf0Var2.f39270i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ue0 ue0Var = (ue0) this.f38243f;
                    if (ue0Var.P <= 0 || ue0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public uf0(ue0 ue0Var, Context context) {
        super(ue0Var.f38229a0, context);
        this.e = 2;
        this.f38243f = ue0Var;
    }
}
