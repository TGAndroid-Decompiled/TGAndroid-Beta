package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class up implements ValueAnimator.AnimatorUpdateListener {
    public final int f42461a;
    public final dq f42462b;

    public up(dq dqVar, int i10) {
        this.f42461a = i10;
        this.f42462b = dqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42461a) {
            case 0:
                dq dqVar = this.f42462b;
                dqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dqVar.h.invalidateSelf();
                return;
            default:
                dq dqVar2 = this.f42462b;
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
