package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class up implements ValueAnimator.AnimatorUpdateListener {
    public final int f42022a;
    public final dq f42023b;

    public up(dq dqVar, int i10) {
        this.f42022a = i10;
        this.f42023b = dqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42022a) {
            case 0:
                dq dqVar = this.f42023b;
                dqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dqVar.h.invalidateSelf();
                return;
            default:
                dq dqVar2 = this.f42023b;
                dqVar2.getClass();
                dqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = dqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
