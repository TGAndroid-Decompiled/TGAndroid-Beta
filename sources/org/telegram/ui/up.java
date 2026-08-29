package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class up implements ValueAnimator.AnimatorUpdateListener {
    public final int f43304a;
    public final dq f43305b;

    public up(dq dqVar, int i10) {
        this.f43304a = i10;
        this.f43305b = dqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43304a) {
            case 0:
                dq dqVar = this.f43305b;
                dqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dqVar.h.invalidateSelf();
                return;
            default:
                dq dqVar2 = this.f43305b;
                dqVar2.getClass();
                dqVar2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = dqVar2.f37580e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
