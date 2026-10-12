package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class we1 extends AnimatorListenerAdapter {
    public final int f41260a;
    public final af1 f41261b;

    public we1(af1 af1Var, int i10) {
        this.f41260a = i10;
        this.f41261b = af1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41260a) {
            case 0:
                af1 af1Var = this.f41261b;
                af1Var.v = 0;
                af1Var.f34203n.setVisibility(8);
                return;
            case 1:
                this.f41261b.v = 0;
                return;
            default:
                this.f41261b.F.setVisibility(8);
                return;
        }
    }
}
