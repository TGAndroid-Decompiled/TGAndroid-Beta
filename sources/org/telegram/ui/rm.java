package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class rm implements ValueAnimator.AnimatorUpdateListener {
    public final int f49532a;
    public final sm f49533b;

    public rm(sm smVar, int i7) {
        this.f49532a = i7;
        this.f49533b = smVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49532a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm smVar = this.f49533b;
                smVar.f49789a = floatValue;
                View view = smVar.f49790b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm smVar2 = this.f49533b;
                smVar2.f49789a = floatValue2;
                View view2 = smVar2.f49790b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm smVar3 = this.f49533b;
                smVar3.f49789a = floatValue3;
                View view3 = smVar3.f49790b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
