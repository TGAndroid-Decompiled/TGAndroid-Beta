package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wv implements ValueAnimator.AnimatorUpdateListener {
    public final int f41662a;
    public final yy f41663b;

    public wv(yy yyVar, int i10) {
        this.f41662a = i10;
        this.f41663b = yyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41662a) {
            case 0:
                yy yyVar = this.f41663b;
                yyVar.getClass();
                yyVar.w4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f41663b.A4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                yy yyVar2 = this.f41663b;
                yyVar2.getClass();
                yyVar2.C4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
