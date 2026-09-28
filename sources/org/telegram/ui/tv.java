package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38243a;
    public final qy f38244b;
    public final float f38245c;

    public tv(qy qyVar, float f7, int i10) {
        this.f38243a = i10;
        this.f38244b = qyVar;
        this.f38245c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38243a) {
            case 0:
                qy.V(this.f38244b, this.f38245c, valueAnimator);
                return;
            default:
                qy.E0(this.f38244b, this.f38245c, valueAnimator);
                return;
        }
    }
}
