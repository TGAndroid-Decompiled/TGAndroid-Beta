package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class ui implements ValueAnimator.AnimatorUpdateListener {
    public final int f42450a;
    public final org.telegram.ui.ActionBar.o2 f42451b;

    public ui(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f42450a = i10;
        this.f42451b = o2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42450a) {
            case 0:
                sn snVar = (sn) this.f42451b;
                snVar.f41747xa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.f41561j1.invalidate();
                return;
            case 1:
                ey eyVar = (ey) this.f42451b;
                eyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = eyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((qc1) this.f42451b).f40779y0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
