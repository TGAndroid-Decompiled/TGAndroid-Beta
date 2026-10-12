package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class un implements ValueAnimator.AnimatorUpdateListener {
    public final int f42538a;
    public final vn f42539b;

    public un(vn vnVar, int i10) {
        this.f42538a = i10;
        this.f42539b = vnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42538a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vn vnVar = this.f42539b;
                vnVar.f42815f = floatValue;
                View view = vnVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vn vnVar2 = this.f42539b;
                vnVar2.f42815f = floatValue2;
                View view2 = vnVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vn vnVar3 = this.f42539b;
                vnVar3.f42815f = floatValue3;
                View view3 = vnVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
