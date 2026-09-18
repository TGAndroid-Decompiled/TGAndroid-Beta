package org.telegram.ui;

import android.content.Context;
public final class yf0 extends org.telegram.ui.Components.voip.n2 {
    public final int e;
    public final org.telegram.ui.Components.gw0 f39814f;

    public yf0(ag0 ag0Var, Context context, int i10) {
        super(ag0Var.f32054s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f39814f = ag0Var;
                super(ag0Var.f32054s0, context);
                return;
            default:
                this.f39814f = ag0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((ag0) this.f39814f).f32042i0;
            case 1:
                return ((ag0) this.f39814f).f32042i0;
            default:
                return ((ye0) this.f39814f).M;
        }
    }

    @Override
    public final boolean b() {
        yf0 yf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    ag0 ag0Var = (ag0) this.f39814f;
                    if (ag0Var.V <= 0 || ag0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                ag0 ag0Var2 = (ag0) this.f39814f;
                if (isClickable() && getVisibility() == 0 && !ag0Var2.f32036d0 && (((yf0Var = ag0Var2.v) == null || yf0Var.getVisibility() == 8) && !ag0Var2.f32042i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ye0 ye0Var = (ye0) this.f39814f;
                    if (ye0Var.P <= 0 || ye0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public yf0(ye0 ye0Var, Context context) {
        super(ye0Var.f39797a0, context);
        this.e = 2;
        this.f39814f = ye0Var;
    }
}
