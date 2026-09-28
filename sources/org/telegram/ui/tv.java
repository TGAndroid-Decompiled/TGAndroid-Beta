package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38244a;
    public final qy f38245b;
    public final float f38246c;

    public tv(qy qyVar, float f7, int i10) {
        this.f38244a = i10;
        this.f38245b = qyVar;
        this.f38246c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38244a) {
            case 0:
                qy.V(this.f38245b, this.f38246c, valueAnimator);
                return;
            default:
                qy.E0(this.f38245b, this.f38246c, valueAnimator);
                return;
        }
    }
}
