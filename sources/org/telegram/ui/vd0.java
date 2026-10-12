package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vd0 extends AnimatorListenerAdapter {
    public final int f42764a;
    public final xg0 f42765b;

    public vd0(xg0 xg0Var, int i10) {
        this.f42764a = i10;
        this.f42765b = xg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42764a) {
            case 0:
                xg0 xg0Var = this.f42765b;
                if (xg0Var.d == animator) {
                    xg0Var.d = null;
                    return;
                }
                return;
            default:
                xg0 xg0Var2 = this.f42765b;
                xg0Var2.f43941c.setVisibility(8);
                if (xg0Var2.d == animator) {
                    xg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42764a) {
            case 0:
                this.f42765b.f43941c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
