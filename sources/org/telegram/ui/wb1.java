package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class wb1 extends AnimatorListenerAdapter {
    public final boolean f42985a;
    public final int f42986b;
    public final int f42987c;
    public final boolean d;
    public final pc1 e;

    public wb1(pc1 pc1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = pc1Var;
        this.f42985a = z10;
        this.f42986b = i10;
        this.f42987c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pc1 pc1Var = this.e;
        FrameLayout[] frameLayoutArr = pc1Var.M0;
        pc1Var.f40494s1 = null;
        int i10 = this.f42987c;
        int i11 = this.f42986b;
        boolean z10 = this.f42985a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = pc1Var.f40445b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.m91[] m91VarArr = pc1Var.K0;
        if (this.d) {
            c10 = 0;
        }
        m91VarArr[c10].setVisibility(4);
    }
}
