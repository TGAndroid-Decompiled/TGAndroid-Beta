package org.telegram.ui;

import android.animation.ValueAnimator;
public final class vv implements ValueAnimator.AnimatorUpdateListener {
    public final int f39204a;
    public final qy f39205b;
    public final float f39206c;

    public vv(qy qyVar, float f10, int i10) {
        this.f39204a = i10;
        this.f39205b = qyVar;
        this.f39206c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39204a) {
            case 0:
                qy.V(this.f39205b, this.f39206c, valueAnimator);
                return;
            default:
                qy.E0(this.f39205b, this.f39206c, valueAnimator);
                return;
        }
    }
}
