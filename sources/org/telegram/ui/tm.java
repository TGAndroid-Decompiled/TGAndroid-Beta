package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class tm implements ValueAnimator.AnimatorUpdateListener {
    public final int f50303a;
    public final um f50304b;

    public tm(um umVar, int i7) {
        this.f50303a = i7;
        this.f50304b = umVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50303a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                um umVar = this.f50304b;
                umVar.f50520a = floatValue;
                View view = umVar.f50521b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                um umVar2 = this.f50304b;
                umVar2.f50520a = floatValue2;
                View view2 = umVar2.f50521b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                um umVar3 = this.f50304b;
                umVar3.f50520a = floatValue3;
                View view3 = umVar3.f50521b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
