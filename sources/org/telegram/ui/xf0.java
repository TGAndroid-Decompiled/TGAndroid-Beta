package org.telegram.ui;

import android.content.Context;
public final class xf0 extends org.telegram.ui.Components.voip.o2 {
    public final int f43929e;
    public final org.telegram.ui.Components.dx0 f43930f;

    public xf0(zf0 zf0Var, Context context, int i10) {
        super(zf0Var.f44838s0, context);
        this.f43929e = i10;
        switch (i10) {
            case 1:
                this.f43930f = zf0Var;
                super(zf0Var.f44838s0, context);
                return;
            default:
                this.f43930f = zf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f43929e) {
            case 0:
                return ((zf0) this.f43930f).f44826i0;
            case 1:
                return ((zf0) this.f43930f).f44826i0;
            default:
                return ((xe0) this.f43930f).M;
        }
    }

    @Override
    public final boolean b() {
        xf0 xf0Var;
        switch (this.f43929e) {
            case 0:
                if (getVisibility() == 0) {
                    zf0 zf0Var = (zf0) this.f43930f;
                    if (zf0Var.V <= 0 || zf0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                zf0 zf0Var2 = (zf0) this.f43930f;
                if (isClickable() && getVisibility() == 0 && !zf0Var2.f44819d0 && (((xf0Var = zf0Var2.v) == null || xf0Var.getVisibility() == 8) && !zf0Var2.f44826i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    xe0 xe0Var = (xe0) this.f43930f;
                    if (xe0Var.P <= 0 || xe0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public xf0(xe0 xe0Var, Context context) {
        super(xe0Var.f43913a0, context);
        this.f43929e = 2;
        this.f43930f = xe0Var;
    }
}
