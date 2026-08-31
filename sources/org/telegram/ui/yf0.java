package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class yf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43620a;
    public final cg0 f43621b;

    public yf0(cg0 cg0Var, int i10) {
        this.f43620a = i10;
        this.f43621b = cg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43620a) {
            case 0:
                cg0 cg0Var = this.f43621b;
                cg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg0Var.d.setAlpha(floatValue);
                cg0Var.f35804e.setAlpha(floatValue);
                cg0Var.f35805f.setProgress(floatValue);
                FrameLayout frameLayout = cg0Var.f35809w;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                return;
            default:
                cg0 cg0Var2 = this.f43621b;
                cg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg0Var2.f35805f.setProgress(floatValue2);
                cg0Var2.d.setAlpha(floatValue2);
                cg0Var2.f35804e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = cg0Var2.f35809w;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                return;
        }
    }
}
