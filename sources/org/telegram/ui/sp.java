package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class sp implements ValueAnimator.AnimatorUpdateListener {
    public final int f41498a;
    public final bq f41499b;

    public sp(bq bqVar, int i10) {
        this.f41498a = i10;
        this.f41499b = bqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41498a) {
            case 0:
                bq bqVar = this.f41499b;
                bqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                bqVar.h.invalidateSelf();
                return;
            default:
                bq bqVar2 = this.f41499b;
                bqVar2.getClass();
                bqVar2.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = bqVar2.e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
