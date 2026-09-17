package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vd0 extends AnimatorListenerAdapter {
    public final int f41521a;
    public final wg0 f41522b;

    public vd0(wg0 wg0Var, int i10) {
        this.f41521a = i10;
        this.f41522b = wg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41521a) {
            case 0:
                wg0 wg0Var = this.f41522b;
                if (wg0Var.d == animator) {
                    wg0Var.d = null;
                    return;
                }
                return;
            default:
                wg0 wg0Var2 = this.f41522b;
                wg0Var2.f42364c.setVisibility(8);
                if (wg0Var2.d == animator) {
                    wg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41521a) {
            case 0:
                this.f41522b.f42364c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
