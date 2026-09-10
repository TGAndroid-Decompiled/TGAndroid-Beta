package org.telegram.ui;

import android.animation.ValueAnimator;
public final class zv implements ValueAnimator.AnimatorUpdateListener {
    public final int f39453a;
    public final wy f39454b;
    public final float f39455c;

    public zv(wy wyVar, float f7, int i10) {
        this.f39453a = i10;
        this.f39454b = wyVar;
        this.f39455c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39453a) {
            case 0:
                wy.V(this.f39454b, this.f39455c, valueAnimator);
                return;
            default:
                wy.E0(this.f39454b, this.f39455c, valueAnimator);
                return;
        }
    }
}
