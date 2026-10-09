package org.telegram.ui;

import android.content.Context;
public final class xf0 extends org.telegram.ui.Components.voip.n2 {
    public final int f44022e;
    public final org.telegram.ui.Components.xw0 f44023f;

    public xf0(zf0 zf0Var, Context context, int i10) {
        super(zf0Var.f44610s0, context);
        this.f44022e = i10;
        switch (i10) {
            case 1:
                this.f44023f = zf0Var;
                super(zf0Var.f44610s0, context);
                return;
            default:
                this.f44023f = zf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f44022e) {
            case 0:
                return ((zf0) this.f44023f).f44598i0;
            case 1:
                return ((zf0) this.f44023f).f44598i0;
            default:
                return ((we0) this.f44023f).M;
        }
    }

    @Override
    public final boolean b() {
        xf0 xf0Var;
        switch (this.f44022e) {
            case 0:
                if (getVisibility() == 0) {
                    zf0 zf0Var = (zf0) this.f44023f;
                    if (zf0Var.V <= 0 || zf0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                zf0 zf0Var2 = (zf0) this.f44023f;
                if (isClickable() && getVisibility() == 0 && !zf0Var2.f44591d0 && (((xf0Var = zf0Var2.v) == null || xf0Var.getVisibility() == 8) && !zf0Var2.f44598i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    we0 we0Var = (we0) this.f44023f;
                    if (we0Var.P <= 0 || we0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public xf0(we0 we0Var, Context context) {
        super(we0Var.f43198a0, context);
        this.f44022e = 2;
        this.f44023f = we0Var;
    }
}
