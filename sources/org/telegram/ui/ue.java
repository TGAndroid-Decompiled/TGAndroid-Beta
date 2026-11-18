package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ue implements ValueAnimator.AnimatorUpdateListener {
    public final int f52539a;
    public final bn f52540b;
    public final View f52541c;

    public ue(bn bnVar, org.telegram.ui.Cells.v0 v0Var, int i7) {
        this.f52539a = i7;
        this.f52540b = bnVar;
        this.f52541c = v0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52539a) {
            case 0:
                bn bnVar = this.f52540b;
                bnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.X9 = org.telegram.messenger.g0.L(30.0f) * floatValue;
                bnVar.M9();
                this.f52541c.setAlpha(floatValue);
                return;
            default:
                bn bnVar2 = this.f52540b;
                bnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar2.X9 = org.telegram.messenger.g0.L(30.0f) * floatValue2;
                bnVar2.M9();
                bnVar2.O9();
                this.f52541c.setAlpha(floatValue2);
                return;
        }
    }
}
