package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class se1 extends AnimatorListenerAdapter {
    public final int f41912a;
    public final we1 f41913b;

    public se1(we1 we1Var, int i10) {
        this.f41912a = i10;
        this.f41913b = we1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41912a) {
            case 0:
                we1 we1Var = this.f41913b;
                we1Var.v = 0;
                we1Var.f43152n.setVisibility(8);
                return;
            case 1:
                this.f41913b.v = 0;
                return;
            default:
                this.f41913b.F.setVisibility(8);
                return;
        }
    }
}
