package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tv implements ValueAnimator.AnimatorUpdateListener {
    public final int f37870a;
    public final wy f37871b;

    public tv(wy wyVar, int i10) {
        this.f37870a = i10;
        this.f37871b = wyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37870a) {
            case 0:
                wy wyVar = this.f37871b;
                wyVar.getClass();
                wyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37871b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                wy wyVar2 = this.f37871b;
                wyVar2.getClass();
                wyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
