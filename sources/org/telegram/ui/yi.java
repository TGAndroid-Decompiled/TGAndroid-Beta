package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class yi implements ValueAnimator.AnimatorUpdateListener {
    public final int f43638a;
    public final org.telegram.ui.ActionBar.p2 f43639b;

    public yi(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f43638a = i10;
        this.f43639b = p2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43638a) {
            case 0:
                xn xnVar = (xn) this.f43639b;
                xnVar.f43226ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.U0.invalidate();
                return;
            case 1:
                py pyVar = (py) this.f43639b;
                pyVar.E0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = pyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((ed1) this.f43639b).f36538u0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
