package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class sm implements ValueAnimator.AnimatorUpdateListener {
    public final int f52078a;
    public final tm f52079b;

    public sm(tm tmVar, int i7) {
        this.f52078a = i7;
        this.f52079b = tmVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52078a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tm tmVar = this.f52079b;
                tmVar.f52345a = floatValue;
                View view = tmVar.f52346b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tm tmVar2 = this.f52079b;
                tmVar2.f52345a = floatValue2;
                View view2 = tmVar2.f52346b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tm tmVar3 = this.f52079b;
                tmVar3.f52345a = floatValue3;
                View view3 = tmVar3.f52346b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
