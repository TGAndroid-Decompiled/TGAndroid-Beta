package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class yf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43613a;
    public final cg0 f43614b;

    public yf0(cg0 cg0Var, int i10) {
        this.f43613a = i10;
        this.f43614b = cg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43613a) {
            case 0:
                cg0 cg0Var = this.f43614b;
                cg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg0Var.d.setAlpha(floatValue);
                cg0Var.f35795e.setAlpha(floatValue);
                cg0Var.f35796f.setProgress(floatValue);
                FrameLayout frameLayout = cg0Var.f35800w;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                return;
            default:
                cg0 cg0Var2 = this.f43614b;
                cg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg0Var2.f35796f.setProgress(floatValue2);
                cg0Var2.d.setAlpha(floatValue2);
                cg0Var2.f35795e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = cg0Var2.f35800w;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                return;
        }
    }
}
