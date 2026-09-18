package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wd0 extends AnimatorListenerAdapter {
    public final int f38801a;
    public final xg0 f38802b;

    public wd0(xg0 xg0Var, int i10) {
        this.f38801a = i10;
        this.f38802b = xg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38801a) {
            case 0:
                xg0 xg0Var = this.f38802b;
                if (xg0Var.d == animator) {
                    xg0Var.d = null;
                    return;
                }
                return;
            default:
                xg0 xg0Var2 = this.f38802b;
                xg0Var2.f39465c.setVisibility(8);
                if (xg0Var2.d == animator) {
                    xg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38801a) {
            case 0:
                this.f38802b.f39465c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
