package org.telegram.ui;

import android.content.Context;
public final class sg0 extends hi.d {
    public final int m0;
    public final org.telegram.ui.Components.sa f51995n0;

    public sg0(org.telegram.ui.Components.sa saVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var, true);
        this.m0 = i7;
        this.f51995n0 = saVar;
    }

    @Override
    public final float b(float f10, float f11) {
        boolean z10;
        boolean z11;
        switch (this.m0) {
            case 0:
                ug0 ug0Var = (ug0) this.f51995n0;
                if (ug0Var.f52560j2 == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ug0Var.f52560j2 = f10;
                if (z10) {
                    ug0Var.f52561k2 = new org.telegram.ui.Components.op(ug0Var, 2);
                    ug0Var.f1(false);
                }
                return f10;
            default:
                wg.d1 d1Var = (wg.d1) this.f51995n0;
                if (d1Var.f59750o2 == 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d1Var.f59750o2 = f10;
                if (z11) {
                    d1Var.f59751p2 = new org.telegram.ui.Components.op(d1Var, 3);
                    d1Var.k1(false);
                }
                return f10;
        }
    }
}
