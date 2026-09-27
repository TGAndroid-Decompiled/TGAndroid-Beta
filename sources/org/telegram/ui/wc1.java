package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class wc1 extends AnimatorListenerAdapter {
    public final boolean f38909a;
    public final int f38910b;
    public final int f38911c;
    public final boolean d;
    public final pd1 e;

    public wc1(pd1 pd1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = pd1Var;
        this.f38909a = z10;
        this.f38910b = i10;
        this.f38911c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pd1 pd1Var = this.e;
        FrameLayout[] frameLayoutArr = pd1Var.L0;
        pd1Var.f36438r1 = null;
        int i10 = this.f38911c;
        int i11 = this.f38910b;
        boolean z10 = this.f38909a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = pd1Var.f36393b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.z81[] z81VarArr = pd1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        z81VarArr[c10].setVisibility(4);
    }
}
