package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class wc1 extends AnimatorListenerAdapter {
    public final boolean f42079a;
    public final int f42080b;
    public final int f42081c;
    public final boolean d;
    public final pd1 f42082e;

    public wc1(pd1 pd1Var, boolean z10, int i10, int i11, boolean z11) {
        this.f42082e = pd1Var;
        this.f42079a = z10;
        this.f42080b = i10;
        this.f42081c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pd1 pd1Var = this.f42082e;
        FrameLayout[] frameLayoutArr = pd1Var.L0;
        pd1Var.f39536r1 = null;
        int i10 = this.f42081c;
        int i11 = this.f42080b;
        boolean z10 = this.f42079a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = pd1Var.f39490b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.i91[] i91VarArr = pd1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        i91VarArr[c10].setVisibility(4);
    }
}
