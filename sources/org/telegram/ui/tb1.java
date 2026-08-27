package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

public final class tb1 extends AnimatorListenerAdapter {

    public final boolean f42849a;

    public final int f42850b;

    public final int f42851c;
    public final boolean d;

    public final nc1 f42852e;

    public tb1(nc1 nc1Var, boolean z10, int i10, int i11, boolean z11) {
        this.f42852e = nc1Var;
        this.f42849a = z10;
        this.f42850b = i10;
        this.f42851c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nc1 nc1Var = this.f42852e;
        FrameLayout[] frameLayoutArr = nc1Var.H0;
        nc1Var.f40771n1 = null;
        int i10 = this.f42851c;
        int i11 = this.f42850b;
        boolean z10 = this.f42849a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = nc1Var.f40738b;
        if (i12 == 1 || i12 == 2) {
            nc1Var.F0[this.d ? (char) 0 : (char) 2].setVisibility(4);
        } else if (i10 == 1) {
            frameLayoutArr[i11].setAlpha(0.0f);
        }
    }
}
