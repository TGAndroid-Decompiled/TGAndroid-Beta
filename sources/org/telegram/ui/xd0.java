package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xd0 extends AnimatorListenerAdapter {
    public final int f39534a;
    public final yg0 f39535b;

    public xd0(yg0 yg0Var, int i10) {
        this.f39534a = i10;
        this.f39535b = yg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39534a) {
            case 0:
                yg0 yg0Var = this.f39535b;
                if (yg0Var.d == animator) {
                    yg0Var.d = null;
                    return;
                }
                return;
            default:
                yg0 yg0Var2 = this.f39535b;
                yg0Var2.f39892c.setVisibility(8);
                if (yg0Var2.d == animator) {
                    yg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39534a) {
            case 0:
                this.f39535b.f39892c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
