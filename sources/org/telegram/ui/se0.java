package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class se0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41352a;
    public final ve0 f41353b;

    public se0(ve0 ve0Var, int i10) {
        this.f41352a = i10;
        this.f41353b = ve0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41352a) {
            case 0:
                ve0 ve0Var = this.f41353b;
                ve0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ve0Var.d.setAlpha(floatValue);
                ve0Var.e.setAlpha(floatValue);
                ve0Var.f42510f.setProgress(floatValue);
                FrameLayout frameLayout = ve0Var.f42515x;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                ve0 ve0Var2 = this.f41353b;
                ve0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ve0Var2.f42510f.setProgress(floatValue2);
                ve0Var2.d.setAlpha(floatValue2);
                ve0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = ve0Var2.f42515x;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
