package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tv implements ValueAnimator.AnimatorUpdateListener {
    public final int f37043a;
    public final wy f37044b;

    public tv(wy wyVar, int i10) {
        this.f37043a = i10;
        this.f37044b = wyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37043a) {
            case 0:
                wy wyVar = this.f37044b;
                wyVar.getClass();
                wyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37044b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                wy wyVar2 = this.f37044b;
                wyVar2.getClass();
                wyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
