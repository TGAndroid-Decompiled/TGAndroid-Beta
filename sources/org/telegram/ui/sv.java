package org.telegram.ui;

import android.animation.ValueAnimator;
public final class sv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40584a;
    public final uy f40585b;

    public sv(uy uyVar, int i10) {
        this.f40584a = i10;
        this.f40585b = uyVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40584a) {
            case 0:
                uy uyVar = this.f40585b;
                uyVar.getClass();
                uyVar.z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                this.f40585b.D4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                uy uyVar2 = this.f40585b;
                uyVar2.getClass();
                uyVar2.F4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
