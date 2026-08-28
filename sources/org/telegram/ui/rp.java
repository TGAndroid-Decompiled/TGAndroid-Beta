package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class rp implements ValueAnimator.AnimatorUpdateListener {
    public final int f42471a;
    public final bq f42472b;

    public rp(bq bqVar, int i9) {
        this.f42471a = i9;
        this.f42472b = bqVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42471a) {
            case 0:
                bq bqVar = this.f42472b;
                bqVar.h.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                bqVar.h.invalidateSelf();
                return;
            default:
                bq bqVar2 = this.f42472b;
                bqVar2.getClass();
                bqVar2.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FrameLayout frameLayout = bqVar2.f36926e;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
