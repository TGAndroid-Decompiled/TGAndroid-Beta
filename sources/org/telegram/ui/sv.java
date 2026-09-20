package org.telegram.ui;

import android.animation.ValueAnimator;
public final class sv implements ValueAnimator.AnimatorUpdateListener {
    public final int f37557a;
    public final uy f37558b;

    public sv(uy uyVar, int i10) {
        this.f37557a = i10;
        this.f37558b = uyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37557a) {
            case 0:
                uy uyVar = this.f37558b;
                uyVar.getClass();
                uyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37558b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                uy uyVar2 = this.f37558b;
                uyVar2.getClass();
                uyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
