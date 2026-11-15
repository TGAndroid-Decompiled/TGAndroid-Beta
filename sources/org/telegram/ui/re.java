package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class re implements ValueAnimator.AnimatorUpdateListener {
    public final int f50934a;
    public final an f50935b;
    public final View f50936c;

    public re(an anVar, org.telegram.ui.Cells.t0 t0Var, int i7) {
        this.f50934a = i7;
        this.f50935b = anVar;
        this.f50936c = t0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50934a) {
            case 0:
                an anVar = this.f50935b;
                anVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.W9 = org.telegram.messenger.g0.L(30.0f) * floatValue;
                anVar.M9();
                this.f50936c.setAlpha(floatValue);
                return;
            default:
                an anVar2 = this.f50935b;
                anVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.W9 = org.telegram.messenger.g0.L(30.0f) * floatValue2;
                anVar2.M9();
                anVar2.O9();
                this.f50936c.setAlpha(floatValue2);
                return;
        }
    }
}
