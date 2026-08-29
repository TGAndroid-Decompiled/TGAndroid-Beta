package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ti implements ValueAnimator.AnimatorUpdateListener {
    public final int f42714a;
    public final org.telegram.ui.ActionBar.o2 f42715b;

    public ti(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f42714a = i10;
        this.f42715b = o2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42714a) {
            case 0:
                tn tnVar = (tn) this.f42715b;
                tnVar.f42836ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tnVar.T0.invalidate();
                return;
            case 1:
                fy fyVar = (fy) this.f42715b;
                fyVar.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = fyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((qc1) this.f42715b).f41672t0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
