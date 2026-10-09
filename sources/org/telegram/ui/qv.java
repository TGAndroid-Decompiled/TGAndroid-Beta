package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qv implements ValueAnimator.AnimatorUpdateListener {
    public final int f41190a;
    public final ty f41191b;

    public qv(ty tyVar, int i10) {
        this.f41190a = i10;
        this.f41191b = tyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41190a) {
            case 0:
                ty tyVar = this.f41191b;
                tyVar.getClass();
                tyVar.w4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f41191b.A4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ty tyVar2 = this.f41191b;
                tyVar2.getClass();
                tyVar2.C4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
