package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class vn implements ValueAnimator.AnimatorUpdateListener {
    public final int f40735a;
    public final wn f40736b;

    public vn(wn wnVar, int i10) {
        this.f40735a = i10;
        this.f40736b = wnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40735a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn wnVar = this.f40736b;
                wnVar.f41327f = floatValue;
                View view = wnVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn wnVar2 = this.f40736b;
                wnVar2.f41327f = floatValue2;
                View view2 = wnVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn wnVar3 = this.f40736b;
                wnVar3.f41327f = floatValue3;
                View view3 = wnVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
