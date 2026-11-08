package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class rm implements ValueAnimator.AnimatorUpdateListener {
    public final int f49511a;
    public final sm f49512b;

    public rm(sm smVar, int i7) {
        this.f49511a = i7;
        this.f49512b = smVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49511a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm smVar = this.f49512b;
                smVar.f49780a = floatValue;
                View view = smVar.f49781b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm smVar2 = this.f49512b;
                smVar2.f49780a = floatValue2;
                View view2 = smVar2.f49781b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm smVar3 = this.f49512b;
                smVar3.f49780a = floatValue3;
                View view3 = smVar3.f49781b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
