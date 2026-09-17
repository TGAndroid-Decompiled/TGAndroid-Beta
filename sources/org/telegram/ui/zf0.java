package org.telegram.ui;

import android.content.Context;
public final class zf0 extends org.telegram.ui.Components.voip.n2 {
    public final int e;
    public final org.telegram.ui.Components.vv0 f40246f;

    public zf0(bg0 bg0Var, Context context, int i10) {
        super(bg0Var.f32153s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f40246f = bg0Var;
                super(bg0Var.f32153s0, context);
                return;
            default:
                this.f40246f = bg0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((bg0) this.f40246f).f32141i0;
            case 1:
                return ((bg0) this.f40246f).f32141i0;
            default:
                return ((ze0) this.f40246f).M;
        }
    }

    @Override
    public final boolean b() {
        zf0 zf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    bg0 bg0Var = (bg0) this.f40246f;
                    if (bg0Var.V <= 0 || bg0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                bg0 bg0Var2 = (bg0) this.f40246f;
                if (isClickable() && getVisibility() == 0 && !bg0Var2.f32135d0 && (((zf0Var = bg0Var2.v) == null || zf0Var.getVisibility() == 8) && !bg0Var2.f32141i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ze0 ze0Var = (ze0) this.f40246f;
                    if (ze0Var.P <= 0 || ze0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public zf0(ze0 ze0Var, Context context) {
        super(ze0Var.f40228a0, context);
        this.e = 2;
        this.f40246f = ze0Var;
    }
}
