package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ya0 extends AnimatorListenerAdapter {
    public final int f52237a;
    public final xd0 f52238b;

    public ya0(xd0 xd0Var, int i3) {
        this.f52237a = i3;
        this.f52238b = xd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52237a) {
            case 0:
                xd0 xd0Var = this.f52238b;
                if (xd0Var.d == animator) {
                    xd0Var.d = null;
                    return;
                }
                return;
            default:
                xd0 xd0Var2 = this.f52238b;
                xd0Var2.f51950c.setVisibility(8);
                if (xd0Var2.d == animator) {
                    xd0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f52237a) {
            case 0:
                this.f52238b.f51950c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
