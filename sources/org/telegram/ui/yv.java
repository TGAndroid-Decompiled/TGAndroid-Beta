package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yv implements ValueAnimator.AnimatorUpdateListener {
    public final int f43253a;
    public final uy f43254b;
    public final float f43255c;

    public yv(uy uyVar, float f7, int i10) {
        this.f43253a = i10;
        this.f43254b = uyVar;
        this.f43255c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43253a) {
            case 0:
                uy.V(this.f43254b, this.f43255c, valueAnimator);
                return;
            default:
                uy.E0(this.f43254b, this.f43255c, valueAnimator);
                return;
        }
    }
}
