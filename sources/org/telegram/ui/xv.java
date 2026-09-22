package org.telegram.ui;

import android.animation.ValueAnimator;
public final class xv implements ValueAnimator.AnimatorUpdateListener {
    public final int f39695a;
    public final uy f39696b;
    public final float f39697c;

    public xv(uy uyVar, float f7, int i10) {
        this.f39695a = i10;
        this.f39696b = uyVar;
        this.f39697c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39695a) {
            case 0:
                uy.V(this.f39696b, this.f39697c, valueAnimator);
                return;
            default:
                uy.E0(this.f39696b, this.f39697c, valueAnimator);
                return;
        }
    }
}
