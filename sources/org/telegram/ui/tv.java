package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tv implements ValueAnimator.AnimatorUpdateListener {
    public final int f42298a;
    public final vy f42299b;

    public tv(vy vyVar, int i10) {
        this.f42298a = i10;
        this.f42299b = vyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42298a) {
            case 0:
                vy vyVar = this.f42299b;
                vyVar.getClass();
                vyVar.w4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f42299b.A4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                vy vyVar2 = this.f42299b;
                vyVar2.getClass();
                vyVar2.C4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
