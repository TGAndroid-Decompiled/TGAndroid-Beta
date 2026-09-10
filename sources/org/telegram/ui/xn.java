package org.telegram.ui;

import android.animation.ValueAnimator;
public final class xn implements ValueAnimator.AnimatorUpdateListener {
    public final int f38780a;
    public final org.telegram.ui.Components.lc0 f38781b;

    public xn(org.telegram.ui.Components.lc0 lc0Var, int i10) {
        this.f38780a = i10;
        this.f38781b = lc0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38780a) {
            case 0:
                this.f38781b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f38781b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f38781b.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
