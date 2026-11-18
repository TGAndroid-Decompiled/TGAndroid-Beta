package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ue implements ValueAnimator.AnimatorUpdateListener {
    public final int f52541a;
    public final bn f52542b;
    public final View f52543c;

    public ue(bn bnVar, org.telegram.ui.Cells.u0 u0Var, int i7) {
        this.f52541a = i7;
        this.f52542b = bnVar;
        this.f52543c = u0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52541a) {
            case 0:
                bn bnVar = this.f52542b;
                bnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.X9 = org.telegram.messenger.g0.L(30.0f) * floatValue;
                bnVar.M9();
                this.f52543c.setAlpha(floatValue);
                return;
            default:
                bn bnVar2 = this.f52542b;
                bnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.X9 = org.telegram.messenger.g0.L(30.0f) * floatValue2;
                bnVar2.M9();
                bnVar2.O9();
                this.f52543c.setAlpha(floatValue2);
                return;
        }
    }
}
