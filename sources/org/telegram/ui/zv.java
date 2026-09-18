package org.telegram.ui;

import android.animation.ValueAnimator;
public final class zv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40349a;
    public final wy f40350b;
    public final float f40351c;

    public zv(wy wyVar, float f7, int i10) {
        this.f40349a = i10;
        this.f40350b = wyVar;
        this.f40351c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40349a) {
            case 0:
                wy.V(this.f40350b, this.f40351c, valueAnimator);
                return;
            default:
                wy.E0(this.f40350b, this.f40351c, valueAnimator);
                return;
        }
    }
}
