package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class te implements ValueAnimator.AnimatorUpdateListener {
    public final int f50169a;
    public final cn f50170b;
    public final View f50171c;

    public te(cn cnVar, org.telegram.ui.Cells.t0 t0Var, int i7) {
        this.f50169a = i7;
        this.f50170b = cnVar;
        this.f50171c = t0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50169a) {
            case 0:
                cn cnVar = this.f50170b;
                cnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar.V9 = org.telegram.messenger.g0.L(30.0f) * floatValue;
                cnVar.L9();
                this.f50171c.setAlpha(floatValue);
                return;
            default:
                cn cnVar2 = this.f50170b;
                cnVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar2.V9 = org.telegram.messenger.g0.L(30.0f) * floatValue2;
                cnVar2.L9();
                cnVar2.N9();
                this.f50171c.setAlpha(floatValue2);
                return;
        }
    }
}
