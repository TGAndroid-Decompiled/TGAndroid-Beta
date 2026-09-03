package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qv implements ValueAnimator.AnimatorUpdateListener {
    public final int f37503a;
    public final qy f37504b;

    public qv(qy qyVar, int i10) {
        this.f37503a = i10;
        this.f37504b = qyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37503a) {
            case 0:
                qy qyVar = this.f37504b;
                qyVar.getClass();
                qyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37504b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                qy qyVar2 = this.f37504b;
                qyVar2.getClass();
                qyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
