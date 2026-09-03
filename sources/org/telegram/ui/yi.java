package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class yi implements ValueAnimator.AnimatorUpdateListener {
    public final int f43631a;
    public final org.telegram.ui.ActionBar.p2 f43632b;

    public yi(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f43631a = i10;
        this.f43632b = p2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43631a) {
            case 0:
                xn xnVar = (xn) this.f43632b;
                xnVar.f43204ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.U0.invalidate();
                return;
            case 1:
                py pyVar = (py) this.f43632b;
                pyVar.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = pyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((jd1) this.f43632b).f38013u0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
