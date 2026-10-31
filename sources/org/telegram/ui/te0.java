package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class te0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41824a;
    public final we0 f41825b;

    public te0(we0 we0Var, int i10) {
        this.f41824a = i10;
        this.f41825b = we0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41824a) {
            case 0:
                we0 we0Var = this.f41825b;
                we0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                we0Var.d.setAlpha(floatValue);
                we0Var.e.setAlpha(floatValue);
                we0Var.f42961f.setProgress(floatValue);
                FrameLayout frameLayout = we0Var.f42966x;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                we0 we0Var2 = this.f41825b;
                we0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                we0Var2.f42961f.setProgress(floatValue2);
                we0Var2.d.setAlpha(floatValue2);
                we0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = we0Var2.f42966x;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
