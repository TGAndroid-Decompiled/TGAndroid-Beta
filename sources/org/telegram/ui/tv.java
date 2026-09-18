package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tv implements ValueAnimator.AnimatorUpdateListener {
    public final int f37875a;
    public final wy f37876b;

    public tv(wy wyVar, int i10) {
        this.f37875a = i10;
        this.f37876b = wyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37875a) {
            case 0:
                wy wyVar = this.f37876b;
                wyVar.getClass();
                wyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37876b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                wy wyVar2 = this.f37876b;
                wyVar2.getClass();
                wyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
