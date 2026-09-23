package org.telegram.ui;

import android.animation.ValueAnimator;
public final class uv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38223a;
    public final ry f38224b;
    public final float f38225c;

    public uv(ry ryVar, float f7, int i10) {
        this.f38223a = i10;
        this.f38224b = ryVar;
        this.f38225c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38223a) {
            case 0:
                ry.V(this.f38224b, this.f38225c, valueAnimator);
                return;
            default:
                ry.E0(this.f38224b, this.f38225c, valueAnimator);
                return;
        }
    }
}
