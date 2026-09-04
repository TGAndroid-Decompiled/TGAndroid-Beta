package org.telegram.ui;

import android.animation.ValueAnimator;
public final class sv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40556a;
    public final uy f40557b;

    public sv(uy uyVar, int i10) {
        this.f40556a = i10;
        this.f40557b = uyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40556a) {
            case 0:
                uy uyVar = this.f40557b;
                uyVar.getClass();
                uyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f40557b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                uy uyVar2 = this.f40557b;
                uyVar2.getClass();
                uyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
