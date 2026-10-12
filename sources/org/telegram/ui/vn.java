package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class vn implements ValueAnimator.AnimatorUpdateListener {
    public final int f41046a;
    public final wn f41047b;

    public vn(wn wnVar, int i10) {
        this.f41046a = i10;
        this.f41047b = wnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41046a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn wnVar = this.f41047b;
                wnVar.f41622f = floatValue;
                View view = wnVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn wnVar2 = this.f41047b;
                wnVar2.f41622f = floatValue2;
                View view2 = wnVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn wnVar3 = this.f41047b;
                wnVar3.f41622f = floatValue3;
                View view3 = wnVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
