package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yv implements ValueAnimator.AnimatorUpdateListener {
    public final int f43226a;
    public final uy f43227b;
    public final float f43228c;

    public yv(uy uyVar, float f7, int i10) {
        this.f43226a = i10;
        this.f43227b = uyVar;
        this.f43228c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43226a) {
            case 0:
                uy.V(this.f43227b, this.f43228c, valueAnimator);
                return;
            default:
                uy.E0(this.f43227b, this.f43228c, valueAnimator);
                return;
        }
    }
}
