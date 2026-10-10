package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qv implements ValueAnimator.AnimatorUpdateListener {
    public final int f41236a;
    public final ty f41237b;

    public qv(ty tyVar, int i10) {
        this.f41236a = i10;
        this.f41237b = tyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41236a) {
            case 0:
                ty tyVar = this.f41237b;
                tyVar.getClass();
                tyVar.w4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f41237b.A4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ty tyVar2 = this.f41237b;
                tyVar2.getClass();
                tyVar2.C4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
