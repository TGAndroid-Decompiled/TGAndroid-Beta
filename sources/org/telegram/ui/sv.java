package org.telegram.ui;

import android.animation.ValueAnimator;
public final class sv implements ValueAnimator.AnimatorUpdateListener {
    public final int f37581a;
    public final uy f37582b;

    public sv(uy uyVar, int i10) {
        this.f37581a = i10;
        this.f37582b = uyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37581a) {
            case 0:
                uy uyVar = this.f37582b;
                uyVar.getClass();
                uyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f37582b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                uy uyVar2 = this.f37582b;
                uyVar2.getClass();
                uyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
