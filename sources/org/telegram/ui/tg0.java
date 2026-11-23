package org.telegram.ui;

import android.content.Context;
public final class tg0 extends hi.d {
    public final int m0;
    public final org.telegram.ui.Components.sa f52278n0;

    public tg0(org.telegram.ui.Components.sa saVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var, true);
        this.m0 = i7;
        this.f52278n0 = saVar;
    }

    @Override
    public final float b(float f10, float f11) {
        boolean z10;
        boolean z11;
        switch (this.m0) {
            case 0:
                vg0 vg0Var = (vg0) this.f52278n0;
                if (vg0Var.f52806j2 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vg0Var.f52806j2 = f10;
                if (z10) {
                    vg0Var.f52807k2 = new org.telegram.ui.Components.qp(vg0Var, 2);
                    vg0Var.f1(false);
                }
                return f10;
            default:
                wg.e1 e1Var = (wg.e1) this.f52278n0;
                if (e1Var.f59766o2 == 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e1Var.f59766o2 = f10;
                if (z11) {
                    e1Var.f59767p2 = new org.telegram.ui.Components.qp(e1Var, 3);
                    e1Var.k1(false);
                }
                return f10;
        }
    }
}
