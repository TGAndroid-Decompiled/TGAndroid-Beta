package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class td0 extends AnimatorListenerAdapter {
    public final int f40855a;
    public final ug0 f40856b;

    public td0(ug0 ug0Var, int i10) {
        this.f40855a = i10;
        this.f40856b = ug0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40855a) {
            case 0:
                ug0 ug0Var = this.f40856b;
                if (ug0Var.d == animator) {
                    ug0Var.d = null;
                    return;
                }
                return;
            default:
                ug0 ug0Var2 = this.f40856b;
                ug0Var2.f41240c.setVisibility(8);
                if (ug0Var2.d == animator) {
                    ug0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40855a) {
            case 0:
                this.f40856b.f41240c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
