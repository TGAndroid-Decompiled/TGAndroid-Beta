package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class xb1 extends AnimatorListenerAdapter {
    public final boolean f43563a;
    public final int f43564b;
    public final int f43565c;
    public final boolean d;
    public final qc1 e;

    public xb1(qc1 qc1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = qc1Var;
        this.f43563a = z10;
        this.f43564b = i10;
        this.f43565c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qc1 qc1Var = this.e;
        FrameLayout[] frameLayoutArr = qc1Var.M0;
        qc1Var.f40765s1 = null;
        int i10 = this.f43565c;
        int i11 = this.f43564b;
        boolean z10 = this.f43563a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = qc1Var.f40716b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.m91[] m91VarArr = qc1Var.K0;
        if (this.d) {
            c10 = 0;
        }
        m91VarArr[c10].setVisibility(4);
    }
}
