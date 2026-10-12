package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class un implements ValueAnimator.AnimatorUpdateListener {
    public final int f42540a;
    public final vn f42541b;

    public un(vn vnVar, int i10) {
        this.f42540a = i10;
        this.f42541b = vnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42540a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vn vnVar = this.f42541b;
                vnVar.f42817f = floatValue;
                View view = vnVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vn vnVar2 = this.f42541b;
                vnVar2.f42817f = floatValue2;
                View view2 = vnVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vn vnVar3 = this.f42541b;
                vnVar3.f42817f = floatValue3;
                View view3 = vnVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
