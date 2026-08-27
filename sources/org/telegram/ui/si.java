package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

public final class si implements ValueAnimator.AnimatorUpdateListener {

    public final int f42653a;

    public final org.telegram.ui.ActionBar.n2 f42654b;

    public si(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f42653a = i10;
        this.f42654b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42653a) {
            case 0:
                rn rnVar = (rn) this.f42654b;
                rnVar.f42074ha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rnVar.T0.invalidate();
                break;
            case 1:
                gy gyVar = (gy) this.f42654b;
                gyVar.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = gyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                break;
            default:
                ((nc1) this.f42654b).f40784t0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
