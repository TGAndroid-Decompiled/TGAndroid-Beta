package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ud0 extends AnimatorListenerAdapter {
    public final int f42448a;
    public final wg0 f42449b;

    public ud0(wg0 wg0Var, int i10) {
        this.f42448a = i10;
        this.f42449b = wg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42448a) {
            case 0:
                wg0 wg0Var = this.f42449b;
                if (wg0Var.d == animator) {
                    wg0Var.d = null;
                    return;
                }
                return;
            default:
                wg0 wg0Var2 = this.f42449b;
                wg0Var2.f43622c.setVisibility(8);
                if (wg0Var2.d == animator) {
                    wg0Var2.d = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42448a) {
            case 0:
                this.f42449b.f43622c.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
