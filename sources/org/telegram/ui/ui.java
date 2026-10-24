package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ui implements ValueAnimator.AnimatorUpdateListener {
    public final int f42437a;
    public final org.telegram.ui.ActionBar.o2 f42438b;

    public ui(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f42437a = i10;
        this.f42438b = o2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42437a) {
            case 0:
                sn snVar = (sn) this.f42438b;
                snVar.f41744xa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.f41558j1.invalidate();
                return;
            case 1:
                ey eyVar = (ey) this.f42438b;
                eyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = eyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((pc1) this.f42438b).f40508y0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
