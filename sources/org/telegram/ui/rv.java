package org.telegram.ui;

import android.animation.ValueAnimator;
public final class rv implements ValueAnimator.AnimatorUpdateListener {
    public final int f37191a;
    public final uy f37192b;

    public rv(uy uyVar, int i10) {
        this.f37191a = i10;
        this.f37192b = uyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37191a) {
            case 0:
                uy uyVar = this.f37192b;
                uyVar.getClass();
                uyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37192b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                uy uyVar2 = this.f37192b;
                uyVar2.getClass();
                uyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
