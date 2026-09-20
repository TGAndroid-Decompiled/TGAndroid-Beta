package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40025a;
    public final uy f40026b;
    public final float f40027c;

    public yv(uy uyVar, float f7, int i10) {
        this.f40025a = i10;
        this.f40026b = uyVar;
        this.f40027c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40025a) {
            case 0:
                uy.V(this.f40026b, this.f40027c, valueAnimator);
                return;
            default:
                uy.E0(this.f40026b, this.f40027c, valueAnimator);
                return;
        }
    }
}
