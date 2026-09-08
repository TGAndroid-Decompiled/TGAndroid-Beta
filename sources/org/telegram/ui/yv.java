package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yv implements ValueAnimator.AnimatorUpdateListener {
    public final int f43252a;
    public final uy f43253b;
    public final float f43254c;

    public yv(uy uyVar, float f7, int i10) {
        this.f43252a = i10;
        this.f43253b = uyVar;
        this.f43254c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43252a) {
            case 0:
                uy.V(this.f43253b, this.f43254c, valueAnimator);
                return;
            default:
                uy.E0(this.f43253b, this.f43254c, valueAnimator);
                return;
        }
    }
}
