package org.telegram.ui;

import android.content.Context;
public final class sf0 extends org.telegram.ui.Components.voip.n2 {
    public final int e;
    public final org.telegram.ui.Components.uv0 f37275f;

    public sf0(uf0 uf0Var, Context context, int i10) {
        super(uf0Var.f38093s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f37275f = uf0Var;
                super(uf0Var.f38093s0, context);
                return;
            default:
                this.f37275f = uf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((uf0) this.f37275f).f38081i0;
            case 1:
                return ((uf0) this.f37275f).f38081i0;
            default:
                return ((se0) this.f37275f).M;
        }
    }

    @Override
    public final boolean b() {
        sf0 sf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    uf0 uf0Var = (uf0) this.f37275f;
                    if (uf0Var.V <= 0 || uf0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                uf0 uf0Var2 = (uf0) this.f37275f;
                if (isClickable() && getVisibility() == 0 && !uf0Var2.f38075d0 && (((sf0Var = uf0Var2.v) == null || sf0Var.getVisibility() == 8) && !uf0Var2.f38081i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    se0 se0Var = (se0) this.f37275f;
                    if (se0Var.P <= 0 || se0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public sf0(se0 se0Var, Context context) {
        super(se0Var.f37253a0, context);
        this.e = 2;
        this.f37275f = se0Var;
    }
}
