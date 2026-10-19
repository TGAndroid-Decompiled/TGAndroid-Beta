package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ui implements ValueAnimator.AnimatorUpdateListener {
    public final int f41977a;
    public final org.telegram.ui.ActionBar.n2 f41978b;

    public ui(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f41977a = i10;
        this.f41978b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41977a) {
            case 0:
                qn qnVar = (qn) this.f41978b;
                qnVar.f40752la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qnVar.X0.invalidate();
                return;
            case 1:
                cy cyVar = (cy) this.f41978b;
                cyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = cyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((kc1) this.f41978b).f38572x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
