package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class vb1 extends AnimatorListenerAdapter {
    public final boolean f43424a;
    public final int f43425b;
    public final int f43426c;
    public final boolean d;
    public final oc1 f43427e;

    public vb1(oc1 oc1Var, boolean z10, int i9, int i10, boolean z11) {
        this.f43427e = oc1Var;
        this.f43424a = z10;
        this.f43425b = i9;
        this.f43426c = i10;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        oc1 oc1Var = this.f43427e;
        FrameLayout[] frameLayoutArr = oc1Var.H0;
        oc1Var.f41092n1 = null;
        int i9 = this.f43426c;
        int i10 = this.f43425b;
        boolean z10 = this.f43424a;
        if (z10 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i9].setVisibility(4);
        }
        int i11 = oc1Var.f41059b;
        char c10 = 2;
        if (i11 != 1 && i11 != 2) {
            if (i9 == 1) {
                frameLayoutArr[i10].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.o71[] o71VarArr = oc1Var.F0;
        if (this.d) {
            c10 = 0;
        }
        o71VarArr[c10].setVisibility(4);
    }
}
