package org.telegram.ui;

import android.content.Context;
public final class rg0 extends fi.d {
    public final int f49410k0;
    public final org.telegram.ui.Components.ma f49411l0;

    public rg0(org.telegram.ui.Components.ma maVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var, true);
        this.f49410k0 = i7;
        this.f49411l0 = maVar;
    }

    @Override
    public final float b(float f10, float f11) {
        boolean z9;
        boolean z10;
        switch (this.f49410k0) {
            case 0:
                tg0 tg0Var = (tg0) this.f49411l0;
                if (tg0Var.f50273i2 == 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                tg0Var.f50273i2 = f10;
                if (z9) {
                    tg0Var.f50274j2 = new org.telegram.ui.Components.yo(tg0Var, 2);
                    tg0Var.e1(false);
                }
                return f10;
            default:
                wg.f1 f1Var = (wg.f1) this.f49411l0;
                if (f1Var.f57738o2 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f1Var.f57738o2 = f10;
                if (z10) {
                    f1Var.f57739p2 = new org.telegram.ui.Components.yo(f1Var, 3);
                    f1Var.n1(false);
                }
                return f10;
        }
    }
}
