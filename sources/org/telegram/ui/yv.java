package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yv implements ValueAnimator.AnimatorUpdateListener {
    public final int f43644a;
    public final uy f43645b;
    public final float f43646c;

    public yv(uy uyVar, float f7, int i10) {
        this.f43644a = i10;
        this.f43645b = uyVar;
        this.f43646c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43644a) {
            case 0:
                uy.T(this.f43645b, this.f43646c, valueAnimator);
                return;
            default:
                uy.F0(this.f43645b, this.f43646c, valueAnimator);
                return;
        }
    }
}
