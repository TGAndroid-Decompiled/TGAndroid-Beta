package org.telegram.ui;

import android.content.Context;
public final class vf0 extends org.telegram.ui.Components.voip.o2 {
    public final int f41733e;
    public final org.telegram.ui.Components.qw0 f41734f;

    public vf0(xf0 xf0Var, Context context, int i10) {
        super(xf0Var.f42874s0, context);
        this.f41733e = i10;
        switch (i10) {
            case 1:
                this.f41734f = xf0Var;
                super(xf0Var.f42874s0, context);
                return;
            default:
                this.f41734f = xf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f41733e) {
            case 0:
                return ((xf0) this.f41734f).f42862i0;
            case 1:
                return ((xf0) this.f41734f).f42862i0;
            default:
                return ((ve0) this.f41734f).M;
        }
    }

    @Override
    public final boolean b() {
        vf0 vf0Var;
        switch (this.f41733e) {
            case 0:
                if (getVisibility() == 0) {
                    xf0 xf0Var = (xf0) this.f41734f;
                    if (xf0Var.V <= 0 || xf0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                xf0 xf0Var2 = (xf0) this.f41734f;
                if (isClickable() && getVisibility() == 0 && !xf0Var2.f42855d0 && (((vf0Var = xf0Var2.v) == null || vf0Var.getVisibility() == 8) && !xf0Var2.f42862i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ve0 ve0Var = (ve0) this.f41734f;
                    if (ve0Var.P <= 0 || ve0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public vf0(ve0 ve0Var, Context context) {
        super(ve0Var.f41711a0, context);
        this.f41733e = 2;
        this.f41734f = ve0Var;
    }
}
