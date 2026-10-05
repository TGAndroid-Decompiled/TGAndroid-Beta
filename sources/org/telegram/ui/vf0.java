package org.telegram.ui;

import android.content.Context;
public final class vf0 extends org.telegram.ui.Components.voip.o2 {
    public final int f41746e;
    public final org.telegram.ui.Components.rw0 f41747f;

    public vf0(xf0 xf0Var, Context context, int i10) {
        super(xf0Var.f42934s0, context);
        this.f41746e = i10;
        switch (i10) {
            case 1:
                this.f41747f = xf0Var;
                super(xf0Var.f42934s0, context);
                return;
            default:
                this.f41747f = xf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f41746e) {
            case 0:
                return ((xf0) this.f41747f).f42922i0;
            case 1:
                return ((xf0) this.f41747f).f42922i0;
            default:
                return ((ve0) this.f41747f).M;
        }
    }

    @Override
    public final boolean b() {
        vf0 vf0Var;
        switch (this.f41746e) {
            case 0:
                if (getVisibility() == 0) {
                    xf0 xf0Var = (xf0) this.f41747f;
                    if (xf0Var.V <= 0 || xf0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                xf0 xf0Var2 = (xf0) this.f41747f;
                if (isClickable() && getVisibility() == 0 && !xf0Var2.f42915d0 && (((vf0Var = xf0Var2.v) == null || vf0Var.getVisibility() == 8) && !xf0Var2.f42922i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ve0 ve0Var = (ve0) this.f41747f;
                    if (ve0Var.P <= 0 || ve0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public vf0(ve0 ve0Var, Context context) {
        super(ve0Var.f41725a0, context);
        this.f41746e = 2;
        this.f41747f = ve0Var;
    }
}
