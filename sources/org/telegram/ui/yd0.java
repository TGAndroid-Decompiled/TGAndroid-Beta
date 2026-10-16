package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yd0 extends AnimatorListenerAdapter {
    public final int f41807a;
    public final ah0 f41808b;

    public yd0(ah0 ah0Var, int i10) {
        this.f41807a = i10;
        this.f41808b = ah0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41807a) {
            case 0:
                ah0 ah0Var = this.f41808b;
                if (ah0Var.d == animator) {
                    ah0Var.d = null;
                    return;
                }
                return;
            default:
                ah0 ah0Var2 = this.f41808b;
                ah0Var2.f33909c.setVisibility(8);
                if (ah0Var2.d == animator) {
                    ah0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41807a) {
            case 0:
                this.f41808b.f33909c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
