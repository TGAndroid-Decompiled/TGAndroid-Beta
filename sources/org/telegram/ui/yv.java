package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yv implements ValueAnimator.AnimatorUpdateListener {
    public final int f43636a;
    public final uy f43637b;
    public final float f43638c;

    public yv(uy uyVar, float f7, int i10) {
        this.f43636a = i10;
        this.f43637b = uyVar;
        this.f43638c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43636a) {
            case 0:
                uy.T(this.f43637b, this.f43638c, valueAnimator);
                return;
            default:
                uy.F0(this.f43637b, this.f43638c, valueAnimator);
                return;
        }
    }
}
