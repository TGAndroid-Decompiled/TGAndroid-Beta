package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class vi implements ValueAnimator.AnimatorUpdateListener {
    public final int f44815a;
    public final org.telegram.ui.ActionBar.r2 f44816b;

    public vi(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f44815a = i10;
        this.f44816b = r2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44815a) {
            case 0:
                un unVar = (un) this.f44816b;
                unVar.f44477xa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                unVar.f44292j1.invalidate();
                return;
            case 1:
                cy cyVar = (cy) this.f44816b;
                cyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = cyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((tc1) this.f44816b).f43799y0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
