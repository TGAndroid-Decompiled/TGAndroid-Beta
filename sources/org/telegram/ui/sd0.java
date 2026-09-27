package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sd0 extends AnimatorListenerAdapter {
    public final int f37404a;
    public final tg0 f37405b;

    public sd0(tg0 tg0Var, int i10) {
        this.f37404a = i10;
        this.f37405b = tg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37404a) {
            case 0:
                tg0 tg0Var = this.f37405b;
                if (tg0Var.d == animator) {
                    tg0Var.d = null;
                    return;
                }
                return;
            default:
                tg0 tg0Var2 = this.f37405b;
                tg0Var2.f37788c.setVisibility(8);
                if (tg0Var2.d == animator) {
                    tg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37404a) {
            case 0:
                this.f37405b.f37788c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
