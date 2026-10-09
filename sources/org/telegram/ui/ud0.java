package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ud0 extends AnimatorListenerAdapter {
    public final int f42402a;
    public final wg0 f42403b;

    public ud0(wg0 wg0Var, int i10) {
        this.f42402a = i10;
        this.f42403b = wg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42402a) {
            case 0:
                wg0 wg0Var = this.f42403b;
                if (wg0Var.d == animator) {
                    wg0Var.d = null;
                    return;
                }
                return;
            default:
                wg0 wg0Var2 = this.f42403b;
                wg0Var2.f43576c.setVisibility(8);
                if (wg0Var2.d == animator) {
                    wg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42402a) {
            case 0:
                this.f42403b.f43576c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
