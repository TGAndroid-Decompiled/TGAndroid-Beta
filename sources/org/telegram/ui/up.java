package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class up implements ValueAnimator.AnimatorUpdateListener {
    public final int f41997a;
    public final dq f41998b;

    public up(dq dqVar, int i10) {
        this.f41997a = i10;
        this.f41998b = dqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41997a) {
            case 0:
                dq dqVar = this.f41998b;
                dqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                dqVar.h.invalidateSelf();
                return;
            default:
                dq dqVar2 = this.f41998b;
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
