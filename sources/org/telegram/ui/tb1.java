package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class tb1 extends AnimatorListenerAdapter {
    public final boolean f41646a;
    public final int f41647b;
    public final int f41648c;
    public final boolean d;
    public final mc1 e;

    public tb1(mc1 mc1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = mc1Var;
        this.f41646a = z10;
        this.f41647b = i10;
        this.f41648c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        mc1 mc1Var = this.e;
        FrameLayout[] frameLayoutArr = mc1Var.L0;
        mc1Var.f39145r1 = null;
        int i10 = this.f41648c;
        int i11 = this.f41647b;
        boolean z10 = this.f41646a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = mc1Var.f39100b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.d91[] d91VarArr = mc1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        d91VarArr[c10].setVisibility(4);
    }
}
