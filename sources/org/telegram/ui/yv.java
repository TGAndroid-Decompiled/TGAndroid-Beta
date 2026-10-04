package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yv implements ValueAnimator.AnimatorUpdateListener {
    public final int f43637a;
    public final uy f43638b;
    public final float f43639c;

    public yv(uy uyVar, float f7, int i10) {
        this.f43637a = i10;
        this.f43638b = uyVar;
        this.f43639c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43637a) {
            case 0:
                uy.T(this.f43638b, this.f43639c, valueAnimator);
                return;
            default:
                uy.F0(this.f43638b, this.f43639c, valueAnimator);
                return;
        }
    }
}
