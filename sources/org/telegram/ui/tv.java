package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38224a;
    public final qy f38225b;
    public final float f38226c;

    public tv(qy qyVar, float f7, int i10) {
        this.f38224a = i10;
        this.f38225b = qyVar;
        this.f38226c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38224a) {
            case 0:
                qy.V(this.f38225b, this.f38226c, valueAnimator);
                return;
            default:
                qy.E0(this.f38225b, this.f38226c, valueAnimator);
                return;
        }
    }
}
