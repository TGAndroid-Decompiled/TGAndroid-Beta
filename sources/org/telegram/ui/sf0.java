package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class sf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41401a;
    public final wf0 f41402b;

    public sf0(wf0 wf0Var, int i10) {
        this.f41401a = i10;
        this.f41402b = wf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41401a) {
            case 0:
                wf0 wf0Var = this.f41402b;
                wf0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wf0Var.d.setAlpha(floatValue);
                wf0Var.e.setAlpha(floatValue);
                wf0Var.f43355f.setProgress(floatValue);
                FrameLayout frameLayout = wf0Var.f43359w;
                frameLayout.setAlpha(floatValue);
                float f7 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f7);
                frameLayout.setScaleY(f7);
                return;
            default:
                wf0 wf0Var2 = this.f41402b;
                wf0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wf0Var2.f43355f.setProgress(floatValue2);
                wf0Var2.d.setAlpha(floatValue2);
                wf0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = wf0Var2.f43359w;
                frameLayout2.setAlpha(floatValue2);
                float f10 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f10);
                frameLayout2.setScaleY(f10);
                return;
        }
    }
}
