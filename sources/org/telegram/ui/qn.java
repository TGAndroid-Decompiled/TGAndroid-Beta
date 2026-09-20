package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class qn implements ValueAnimator.AnimatorUpdateListener {
    public final int f36945a;
    public final rn f36946b;

    public qn(rn rnVar, int i10) {
        this.f36945a = i10;
        this.f36946b = rnVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36945a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn rnVar = this.f36946b;
                rnVar.f37198f = floatValue;
                View view = rnVar.h.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn rnVar2 = this.f36946b;
                rnVar2.f37198f = floatValue2;
                View view2 = rnVar2.h.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn rnVar3 = this.f36946b;
                rnVar3.f37198f = floatValue3;
                View view3 = rnVar3.h.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
