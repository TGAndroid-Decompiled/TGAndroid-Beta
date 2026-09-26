package org.telegram.ui;

import android.animation.ValueAnimator;
public final class tv implements ValueAnimator.AnimatorUpdateListener {
    public final int f38242a;
    public final qy f38243b;
    public final float f38244c;

    public tv(qy qyVar, float f7, int i10) {
        this.f38242a = i10;
        this.f38243b = qyVar;
        this.f38244c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f38242a) {
            case 0:
                qy.V(this.f38243b, this.f38244c, valueAnimator);
                return;
            default:
                qy.E0(this.f38243b, this.f38244c, valueAnimator);
                return;
        }
    }
}
