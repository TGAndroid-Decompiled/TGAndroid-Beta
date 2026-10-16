package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wv implements ValueAnimator.AnimatorUpdateListener {
    public final int f41368a;
    public final yy f41369b;

    public wv(yy yyVar, int i10) {
        this.f41368a = i10;
        this.f41369b = yyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41368a) {
            case 0:
                yy yyVar = this.f41369b;
                yyVar.getClass();
                yyVar.x4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f41369b.B4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                yy yyVar2 = this.f41369b;
                yyVar2.getClass();
                yyVar2.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
