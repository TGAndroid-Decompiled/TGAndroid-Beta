package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class zi implements ValueAnimator.AnimatorUpdateListener {
    public final int f40495a;
    public final org.telegram.ui.ActionBar.m2 f40496b;

    public zi(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f40495a = i10;
        this.f40496b = m2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40495a) {
            case 0:
                wn wnVar = (wn) this.f40496b;
                wnVar.f39538la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.X0.invalidate();
                return;
            case 1:
                qy qyVar = (qy) this.f40496b;
                qyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = qyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((od1) this.f40496b).f36190x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
