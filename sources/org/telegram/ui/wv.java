package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wv implements ValueAnimator.AnimatorUpdateListener {
    public final int f43878a;
    public final sy f43879b;
    public final float f43880c;

    public wv(sy syVar, float f7, int i10) {
        this.f43878a = i10;
        this.f43879b = syVar;
        this.f43880c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43878a) {
            case 0:
                sy.V(this.f43879b, this.f43880c, valueAnimator);
                return;
            default:
                sy.B0(this.f43879b, this.f43880c, valueAnimator);
                return;
        }
    }
}
