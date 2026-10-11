package org.telegram.ui;

import android.animation.ValueAnimator;
public final class wv implements ValueAnimator.AnimatorUpdateListener {
    public final int f43912a;
    public final sy f43913b;
    public final float f43914c;

    public wv(sy syVar, float f7, int i10) {
        this.f43912a = i10;
        this.f43913b = syVar;
        this.f43914c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43912a) {
            case 0:
                sy.V(this.f43913b, this.f43914c, valueAnimator);
                return;
            default:
                sy.B0(this.f43913b, this.f43914c, valueAnimator);
                return;
        }
    }
}
