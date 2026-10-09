package org.telegram.ui;

import android.content.Context;
public final class xf0 extends org.telegram.ui.Components.voip.n2 {
    public final int f44024e;
    public final org.telegram.ui.Components.xw0 f44025f;

    public xf0(zf0 zf0Var, Context context, int i10) {
        super(zf0Var.f44612s0, context);
        this.f44024e = i10;
        switch (i10) {
            case 1:
                this.f44025f = zf0Var;
                super(zf0Var.f44612s0, context);
                return;
            default:
                this.f44025f = zf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f44024e) {
            case 0:
                return ((zf0) this.f44025f).f44600i0;
            case 1:
                return ((zf0) this.f44025f).f44600i0;
            default:
                return ((we0) this.f44025f).M;
        }
    }

    @Override
    public final boolean b() {
        xf0 xf0Var;
        switch (this.f44024e) {
            case 0:
                if (getVisibility() == 0) {
                    zf0 zf0Var = (zf0) this.f44025f;
                    if (zf0Var.V <= 0 || zf0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                zf0 zf0Var2 = (zf0) this.f44025f;
                if (isClickable() && getVisibility() == 0 && !zf0Var2.f44593d0 && (((xf0Var = zf0Var2.v) == null || xf0Var.getVisibility() == 8) && !zf0Var2.f44600i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    we0 we0Var = (we0) this.f44025f;
                    if (we0Var.P <= 0 || we0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public xf0(we0 we0Var, Context context) {
        super(we0Var.f43200a0, context);
        this.f44024e = 2;
        this.f44025f = we0Var;
    }
}
