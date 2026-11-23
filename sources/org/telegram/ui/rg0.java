package org.telegram.ui;

import android.content.Context;
public final class rg0 extends hi.e {
    public final int m0;
    public final org.telegram.ui.Components.ra f51723n0;

    public rg0(org.telegram.ui.Components.ra raVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var, true);
        this.m0 = i7;
        this.f51723n0 = raVar;
    }

    @Override
    public final float b(float f10, float f11) {
        boolean z10;
        boolean z11;
        switch (this.m0) {
            case 0:
                tg0 tg0Var = (tg0) this.f51723n0;
                if (tg0Var.f52399j2 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tg0Var.f52399j2 = f10;
                if (z10) {
                    tg0Var.f52400k2 = new org.telegram.ui.Components.np(tg0Var, 2);
                    tg0Var.f1(false);
                }
                return f10;
            default:
                wg.d1 d1Var = (wg.d1) this.f51723n0;
                if (d1Var.f59861o2 == 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d1Var.f59861o2 = f10;
                if (z11) {
                    d1Var.f59862p2 = new org.telegram.ui.Components.np(d1Var, 3);
                    d1Var.k1(false);
                }
                return f10;
        }
    }
}
