package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38762a;
    public final oy f38763b;
    public final float f38764c;

    public tv(oy oyVar, float f10, int i10) {
        this.f38762a = i10;
        this.f38763b = oyVar;
        this.f38764c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38762a) {
            case 0:
                oy.V(this.f38763b, this.f38764c, valueAnimator);
                return;
            default:
                oy.E0(this.f38763b, this.f38764c, valueAnimator);
                return;
        }
    }
}
