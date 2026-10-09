package org.telegram.ui;

import android.animation.ValueAnimator;
public final class qv implements ValueAnimator.AnimatorUpdateListener {
    public final int f41192a;
    public final ty f41193b;

    public qv(ty tyVar, int i10) {
        this.f41192a = i10;
        this.f41193b = tyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41192a) {
            case 0:
                ty tyVar = this.f41193b;
                tyVar.getClass();
                tyVar.w4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f41193b.A4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ty tyVar2 = this.f41193b;
                tyVar2.getClass();
                tyVar2.C4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
