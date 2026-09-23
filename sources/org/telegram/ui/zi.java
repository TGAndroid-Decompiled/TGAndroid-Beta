package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class zi implements ValueAnimator.AnimatorUpdateListener {
    public final int f40167a;
    public final org.telegram.ui.ActionBar.n2 f40168b;

    public zi(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f40167a = i10;
        this.f40168b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40167a) {
            case 0:
                xn xnVar = (xn) this.f40168b;
                xnVar.f39454la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xnVar.X0.invalidate();
                return;
            case 1:
                ry ryVar = (ry) this.f40168b;
                ryVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ryVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((od1) this.f40168b).f35842x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
