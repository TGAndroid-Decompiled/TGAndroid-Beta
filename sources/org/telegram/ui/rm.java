package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class rm implements ValueAnimator.AnimatorUpdateListener {
    public final int f50969a;
    public final sm f50970b;

    public rm(sm smVar, int i7) {
        this.f50969a = i7;
        this.f50970b = smVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50969a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm smVar = this.f50970b;
                smVar.f51243a = floatValue;
                View view = smVar.f51244b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm smVar2 = this.f50970b;
                smVar2.f51243a = floatValue2;
                View view2 = smVar2.f51244b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm smVar3 = this.f50970b;
                smVar3.f51243a = floatValue3;
                View view3 = smVar3.f51244b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
