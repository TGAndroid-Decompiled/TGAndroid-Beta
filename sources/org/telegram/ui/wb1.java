package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class wb1 extends AnimatorListenerAdapter {
    public final boolean f43929a;
    public final int f43930b;
    public final int f43931c;
    public final boolean d;
    public final qc1 f43932e;

    public wb1(qc1 qc1Var, boolean z10, int i10, int i11, boolean z11) {
        this.f43932e = qc1Var;
        this.f43929a = z10;
        this.f43930b = i10;
        this.f43931c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qc1 qc1Var = this.f43932e;
        FrameLayout[] frameLayoutArr = qc1Var.H0;
        qc1Var.f41659n1 = null;
        int i10 = this.f43931c;
        int i11 = this.f43930b;
        boolean z10 = this.f43929a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = qc1Var.f41626b;
        char c3 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.a81[] a81VarArr = qc1Var.F0;
        if (this.d) {
            c3 = 0;
        }
        a81VarArr[c3].setVisibility(4);
    }
}
