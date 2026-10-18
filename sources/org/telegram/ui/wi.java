package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class wi implements ValueAnimator.AnimatorUpdateListener {
    public final int f42862a;
    public final org.telegram.ui.ActionBar.n2 f42863b;

    public wi(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f42862a = i10;
        this.f42863b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42862a) {
            case 0:
                sn snVar = (sn) this.f42863b;
                snVar.f41276la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.X0.invalidate();
                return;
            case 1:
                ey eyVar = (ey) this.f42863b;
                eyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = eyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((mc1) this.f42863b).f39140x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
