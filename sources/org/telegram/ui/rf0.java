package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class rf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41148a;
    public final vf0 f41149b;

    public rf0(vf0 vf0Var, int i10) {
        this.f41148a = i10;
        this.f41149b = vf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41148a) {
            case 0:
                vf0 vf0Var = this.f41149b;
                vf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf0Var.d.setAlpha(floatValue);
                vf0Var.e.setAlpha(floatValue);
                vf0Var.f42725f.setProgress(floatValue);
                FrameLayout frameLayout = vf0Var.f42729w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                vf0 vf0Var2 = this.f41149b;
                vf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf0Var2.f42725f.setProgress(floatValue2);
                vf0Var2.d.setAlpha(floatValue2);
                vf0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = vf0Var2.f42729w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
