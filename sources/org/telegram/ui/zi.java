package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class zi implements ValueAnimator.AnimatorUpdateListener {
    public final int f40621a;
    public final org.telegram.ui.ActionBar.m2 f40622b;

    public zi(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f40621a = i10;
        this.f40622b = m2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40621a) {
            case 0:
                wn wnVar = (wn) this.f40622b;
                wnVar.f39646la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.X0.invalidate();
                return;
            case 1:
                qy qyVar = (qy) this.f40622b;
                qyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = qyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((od1) this.f40622b).f36351x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
