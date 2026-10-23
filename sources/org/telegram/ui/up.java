package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class up implements ValueAnimator.AnimatorUpdateListener {
    public final int f42487a;
    public final dq f42488b;

    public up(dq dqVar, int i10) {
        this.f42487a = i10;
        this.f42488b = dqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42487a) {
            case 0:
                dq dqVar = this.f42488b;
                dqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dqVar.h.invalidateSelf();
                return;
            default:
                dq dqVar2 = this.f42488b;
                dqVar2.getClass();
                dqVar2.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = dqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
