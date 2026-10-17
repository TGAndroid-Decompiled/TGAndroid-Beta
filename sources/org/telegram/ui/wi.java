package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class wi implements ValueAnimator.AnimatorUpdateListener {
    public final int f42861a;
    public final org.telegram.ui.ActionBar.n2 f42862b;

    public wi(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f42861a = i10;
        this.f42862b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42861a) {
            case 0:
                sn snVar = (sn) this.f42862b;
                snVar.f41290la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.X0.invalidate();
                return;
            case 1:
                ey eyVar = (ey) this.f42862b;
                eyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = eyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((mc1) this.f42862b).f39159x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
