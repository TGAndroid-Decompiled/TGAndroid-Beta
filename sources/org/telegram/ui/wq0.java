package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51591a;
    public final fr0 f51592b;

    public wq0(fr0 fr0Var, int i3) {
        this.f51591a = i3;
        this.f51592b = fr0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51591a) {
            case 0:
                fr0 fr0Var = this.f51592b;
                fr0Var.getClass();
                fr0Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                fr0 fr0Var2 = this.f51592b;
                fr0Var2.getClass();
                fr0Var2.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
