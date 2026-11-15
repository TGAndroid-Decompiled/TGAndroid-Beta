package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class re implements ValueAnimator.AnimatorUpdateListener {
    public final int f50935a;
    public final an f50936b;
    public final View f50937c;

    public re(an anVar, org.telegram.ui.Cells.t0 t0Var, int i7) {
        this.f50935a = i7;
        this.f50936b = anVar;
        this.f50937c = t0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50935a) {
            case 0:
                an anVar = this.f50936b;
                anVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.W9 = org.telegram.messenger.g0.L(30.0f) * floatValue;
                anVar.M9();
                this.f50937c.setAlpha(floatValue);
                return;
            default:
                an anVar2 = this.f50936b;
                anVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.W9 = org.telegram.messenger.g0.L(30.0f) * floatValue2;
                anVar2.M9();
                anVar2.O9();
                this.f50937c.setAlpha(floatValue2);
                return;
        }
    }
}
