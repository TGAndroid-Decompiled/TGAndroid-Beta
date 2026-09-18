package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yv implements ValueAnimator.AnimatorUpdateListener {
    public final int f39910a;
    public final uy f39911b;
    public final float f39912c;

    public yv(uy uyVar, float f7, int i10) {
        this.f39910a = i10;
        this.f39911b = uyVar;
        this.f39912c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39910a) {
            case 0:
                uy.V(this.f39911b, this.f39912c, valueAnimator);
                return;
            default:
                uy.E0(this.f39911b, this.f39912c, valueAnimator);
                return;
        }
    }
}
