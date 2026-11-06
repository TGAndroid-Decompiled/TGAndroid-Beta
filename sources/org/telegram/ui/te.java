package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class te implements ValueAnimator.AnimatorUpdateListener {
    public final int f50043a;
    public final an f50044b;
    public final View f50045c;

    public te(an anVar, org.telegram.ui.Cells.t0 t0Var, int i7) {
        this.f50043a = i7;
        this.f50044b = anVar;
        this.f50045c = t0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50043a) {
            case 0:
                an anVar = this.f50044b;
                anVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.T9 = org.telegram.messenger.g0.L(30.0f) * floatValue;
                anVar.K9();
                this.f50045c.setAlpha(floatValue);
                return;
            default:
                an anVar2 = this.f50044b;
                anVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.T9 = org.telegram.messenger.g0.L(30.0f) * floatValue2;
                anVar2.K9();
                anVar2.M9();
                this.f50045c.setAlpha(floatValue2);
                return;
        }
    }
}
