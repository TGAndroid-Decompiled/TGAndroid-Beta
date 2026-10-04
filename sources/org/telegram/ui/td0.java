package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class td0 extends AnimatorListenerAdapter {
    public final int f40792a;
    public final ug0 f40793b;

    public td0(ug0 ug0Var, int i10) {
        this.f40792a = i10;
        this.f40793b = ug0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40792a) {
            case 0:
                ug0 ug0Var = this.f40793b;
                if (ug0Var.d == animator) {
                    ug0Var.d = null;
                    return;
                }
                return;
            default:
                ug0 ug0Var2 = this.f40793b;
                ug0Var2.f41196c.setVisibility(8);
                if (ug0Var2.d == animator) {
                    ug0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40792a) {
            case 0:
                this.f40793b.f41196c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
