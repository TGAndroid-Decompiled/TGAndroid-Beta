package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class sn implements ValueAnimator.AnimatorUpdateListener {
    public final int f37422a;
    public final tn f37423b;

    public sn(tn tnVar, int i10) {
        this.f37422a = i10;
        this.f37423b = tnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37422a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tn tnVar = this.f37423b;
                tnVar.f37703f = floatValue;
                View view = tnVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tn tnVar2 = this.f37423b;
                tnVar2.f37703f = floatValue2;
                View view2 = tnVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tn tnVar3 = this.f37423b;
                tnVar3.f37703f = floatValue3;
                View view3 = tnVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
