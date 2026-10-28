package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class yi implements ValueAnimator.AnimatorUpdateListener {
    public final int f46027a;
    public final org.telegram.ui.ActionBar.r2 f46028b;

    public yi(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f46027a = i10;
        this.f46028b = r2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46027a) {
            case 0:
                wn wnVar = (wn) this.f46028b;
                wnVar.Ba = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar.f45163j1.invalidate();
                return;
            case 1:
                ey eyVar = (ey) this.f46028b;
                eyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = eyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((vc1) this.f46028b).f44312y0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
