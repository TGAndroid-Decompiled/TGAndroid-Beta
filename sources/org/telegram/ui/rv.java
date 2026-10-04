package org.telegram.ui;

import android.animation.ValueAnimator;
public final class rv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40290a;
    public final uy f40291b;

    public rv(uy uyVar, int i10) {
        this.f40290a = i10;
        this.f40291b = uyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40290a) {
            case 0:
                uy uyVar = this.f40291b;
                uyVar.getClass();
                uyVar.I4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f40291b.M4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                uy uyVar2 = this.f40291b;
                uyVar2.getClass();
                uyVar2.O4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
