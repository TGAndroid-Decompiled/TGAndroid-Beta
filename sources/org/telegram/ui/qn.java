package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class qn implements ValueAnimator.AnimatorUpdateListener {
    public final int f36968a;
    public final rn f36969b;

    public qn(rn rnVar, int i10) {
        this.f36968a = i10;
        this.f36969b = rnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36968a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn rnVar = this.f36969b;
                rnVar.f37220f = floatValue;
                View view = rnVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn rnVar2 = this.f36969b;
                rnVar2.f37220f = floatValue2;
                View view2 = rnVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn rnVar3 = this.f36969b;
                rnVar3.f37220f = floatValue3;
                View view3 = rnVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
