package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ue implements ValueAnimator.AnimatorUpdateListener {
    public final int f50481a;
    public final cn f50482b;
    public final View f50483c;

    public ue(cn cnVar, org.telegram.ui.Cells.t0 t0Var, int i7) {
        this.f50481a = i7;
        this.f50482b = cnVar;
        this.f50483c = t0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50481a) {
            case 0:
                cn cnVar = this.f50482b;
                cnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar.V9 = org.telegram.messenger.g0.L(30.0f) * floatValue;
                cnVar.L9();
                this.f50483c.setAlpha(floatValue);
                return;
            default:
                cn cnVar2 = this.f50482b;
                cnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar2.V9 = org.telegram.messenger.g0.L(30.0f) * floatValue2;
                cnVar2.L9();
                cnVar2.N9();
                this.f50483c.setAlpha(floatValue2);
                return;
        }
    }
}
