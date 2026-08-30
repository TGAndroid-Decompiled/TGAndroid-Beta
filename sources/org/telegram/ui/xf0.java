package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class xf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39907a;
    public final bg0 f39908b;

    public xf0(bg0 bg0Var, int i10) {
        this.f39907a = i10;
        this.f39908b = bg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39907a) {
            case 0:
                bg0 bg0Var = this.f39908b;
                bg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg0Var.d.setAlpha(floatValue);
                bg0Var.e.setAlpha(floatValue);
                bg0Var.f32957f.setProgress(floatValue);
                FrameLayout frameLayout = bg0Var.f32961w;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                return;
            default:
                bg0 bg0Var2 = this.f39908b;
                bg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg0Var2.f32957f.setProgress(floatValue2);
                bg0Var2.d.setAlpha(floatValue2);
                bg0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = bg0Var2.f32961w;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                return;
        }
    }
}
