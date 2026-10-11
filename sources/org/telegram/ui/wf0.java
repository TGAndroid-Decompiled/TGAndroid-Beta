package org.telegram.ui;

import android.content.Context;
public final class wf0 extends org.telegram.ui.Components.voip.o2 {
    public final int f43765e;
    public final org.telegram.ui.Components.zw0 f43766f;

    public wf0(yf0 yf0Var, Context context, int i10) {
        super(yf0Var.f44382s0, context);
        this.f43765e = i10;
        switch (i10) {
            case 1:
                this.f43766f = yf0Var;
                super(yf0Var.f44382s0, context);
                return;
            default:
                this.f43766f = yf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f43765e) {
            case 0:
                return ((yf0) this.f43766f).f44370i0;
            case 1:
                return ((yf0) this.f43766f).f44370i0;
            default:
                return ((ve0) this.f43766f).M;
        }
    }

    @Override
    public final boolean b() {
        wf0 wf0Var;
        switch (this.f43765e) {
            case 0:
                if (getVisibility() == 0) {
                    yf0 yf0Var = (yf0) this.f43766f;
                    if (yf0Var.V <= 0 || yf0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                yf0 yf0Var2 = (yf0) this.f43766f;
                if (isClickable() && getVisibility() == 0 && !yf0Var2.f44363d0 && (((wf0Var = yf0Var2.v) == null || wf0Var.getVisibility() == 8) && !yf0Var2.f44370i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ve0 ve0Var = (ve0) this.f43766f;
                    if (ve0Var.P <= 0 || ve0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public wf0(ve0 ve0Var, Context context) {
        super(ve0Var.f42989a0, context);
        this.f43765e = 2;
        this.f43766f = ve0Var;
    }
}
