package org.telegram.ui;

import android.content.Context;
public final class rf0 extends org.telegram.ui.Components.voip.o2 {
    public final int e;
    public final org.telegram.ui.Components.fw0 f37326f;

    public rf0(tf0 tf0Var, Context context, int i10) {
        super(tf0Var.f38099s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f37326f = tf0Var;
                super(tf0Var.f38099s0, context);
                return;
            default:
                this.f37326f = tf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((tf0) this.f37326f).f38087i0;
            case 1:
                return ((tf0) this.f37326f).f38087i0;
            default:
                return ((re0) this.f37326f).M;
        }
    }

    @Override
    public final boolean b() {
        rf0 rf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    tf0 tf0Var = (tf0) this.f37326f;
                    if (tf0Var.V <= 0 || tf0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                tf0 tf0Var2 = (tf0) this.f37326f;
                if (isClickable() && getVisibility() == 0 && !tf0Var2.f38081d0 && (((rf0Var = tf0Var2.v) == null || rf0Var.getVisibility() == 8) && !tf0Var2.f38087i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    re0 re0Var = (re0) this.f37326f;
                    if (re0Var.P <= 0 || re0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public rf0(re0 re0Var, Context context) {
        super(re0Var.f37312a0, context);
        this.e = 2;
        this.f37326f = re0Var;
    }
}
