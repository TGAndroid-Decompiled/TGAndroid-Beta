package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yv implements ValueAnimator.AnimatorUpdateListener {
    public final int f43225a;
    public final uy f43226b;
    public final float f43227c;

    public yv(uy uyVar, float f7, int i10) {
        this.f43225a = i10;
        this.f43226b = uyVar;
        this.f43227c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43225a) {
            case 0:
                uy.V(this.f43226b, this.f43227c, valueAnimator);
                return;
            default:
                uy.E0(this.f43226b, this.f43227c, valueAnimator);
                return;
        }
    }
}
