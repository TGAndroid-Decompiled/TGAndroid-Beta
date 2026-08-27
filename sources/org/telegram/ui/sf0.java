package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

public final class sf0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f42628a;

    public final wf0 f42629b;

    public sf0(wf0 wf0Var, int i10) {
        this.f42628a = i10;
        this.f42629b = wf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42628a) {
            case 0:
                wf0 wf0Var = this.f42629b;
                wf0Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wf0Var.d.setAlpha(fFloatValue);
                wf0Var.f44103e.setAlpha(fFloatValue);
                wf0Var.f44104f.setProgress(fFloatValue);
                FrameLayout frameLayout = wf0Var.f44108w;
                frameLayout.setAlpha(fFloatValue);
                float f10 = (fFloatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                break;
            default:
                wf0 wf0Var2 = this.f42629b;
                wf0Var2.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wf0Var2.f44104f.setProgress(fFloatValue2);
                wf0Var2.d.setAlpha(fFloatValue2);
                wf0Var2.f44103e.setAlpha(fFloatValue2);
                FrameLayout frameLayout2 = wf0Var2.f44108w;
                frameLayout2.setAlpha(fFloatValue2);
                float f11 = (fFloatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                break;
        }
    }
}
