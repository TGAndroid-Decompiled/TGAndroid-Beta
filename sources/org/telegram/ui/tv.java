package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38333a;
    public final qy f38334b;
    public final float f38335c;

    public tv(qy qyVar, float f7, int i10) {
        this.f38333a = i10;
        this.f38334b = qyVar;
        this.f38335c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38333a) {
            case 0:
                qy.V(this.f38334b, this.f38335c, valueAnimator);
                return;
            default:
                qy.E0(this.f38334b, this.f38335c, valueAnimator);
                return;
        }
    }
}
