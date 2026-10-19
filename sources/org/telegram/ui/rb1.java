package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class rb1 extends AnimatorListenerAdapter {
    public final boolean f41117a;
    public final int f41118b;
    public final int f41119c;
    public final boolean d;
    public final kc1 e;

    public rb1(kc1 kc1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = kc1Var;
        this.f41117a = z10;
        this.f41118b = i10;
        this.f41119c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        kc1 kc1Var = this.e;
        FrameLayout[] frameLayoutArr = kc1Var.L0;
        kc1Var.f38557r1 = null;
        int i10 = this.f41119c;
        int i11 = this.f41118b;
        boolean z10 = this.f41117a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = kc1Var.f38512b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.e91[] e91VarArr = kc1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        e91VarArr[c10].setVisibility(4);
    }
}
