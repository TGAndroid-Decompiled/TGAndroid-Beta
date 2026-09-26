package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class zi implements ValueAnimator.AnimatorUpdateListener {
    public final int f40510a;
    public final org.telegram.ui.ActionBar.m2 f40511b;

    public zi(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f40510a = i10;
        this.f40511b = m2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40510a) {
            case 0:
                wn wnVar = (wn) this.f40511b;
                wnVar.f39552la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.X0.invalidate();
                return;
            case 1:
                qy qyVar = (qy) this.f40511b;
                qyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = qyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((od1) this.f40511b).f36213x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
