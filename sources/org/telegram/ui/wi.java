package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
public final class wi implements ValueAnimator.AnimatorUpdateListener {
    public final int f42885a;
    public final org.telegram.ui.ActionBar.n2 f42886b;

    public wi(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f42885a = i10;
        this.f42886b = n2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42885a) {
            case 0:
                sn snVar = (sn) this.f42886b;
                snVar.f41311la = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar.X0.invalidate();
                return;
            case 1:
                ey eyVar = (ey) this.f42886b;
                eyVar.H0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = eyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                ((mc1) this.f42886b).f39184x0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
