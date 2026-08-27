package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

public final class tp implements ValueAnimator.AnimatorUpdateListener {

    public final int f42988a;

    public final dq f42989b;

    public tp(dq dqVar, int i10) {
        this.f42988a = i10;
        this.f42989b = dqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42988a) {
            case 0:
                dq dqVar = this.f42989b;
                dqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dqVar.h.invalidateSelf();
                break;
            default:
                dq dqVar2 = this.f42989b;
                dqVar2.getClass();
                dqVar2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = dqVar2.f37497e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                }
                break;
        }
    }
}
