package org.telegram.ui;

import android.animation.ValueAnimator;
public final class yv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40047a;
    public final uy f40048b;
    public final float f40049c;

    public yv(uy uyVar, float f7, int i10) {
        this.f40047a = i10;
        this.f40048b = uyVar;
        this.f40049c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40047a) {
            case 0:
                uy.V(this.f40048b, this.f40049c, valueAnimator);
                return;
            default:
                uy.E0(this.f40048b, this.f40049c, valueAnimator);
                return;
        }
    }
}
