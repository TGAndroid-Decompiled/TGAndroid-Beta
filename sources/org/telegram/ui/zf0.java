package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class zf0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40466a;
    public final dg0 f40467b;

    public zf0(dg0 dg0Var, int i10) {
        this.f40466a = i10;
        this.f40467b = dg0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40466a) {
            case 0:
                dg0 dg0Var = this.f40467b;
                dg0Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var.d.setAlpha(floatValue);
                dg0Var.e.setAlpha(floatValue);
                dg0Var.f33466f.setProgress(floatValue);
                FrameLayout frameLayout = dg0Var.f33470w;
                frameLayout.setAlpha(floatValue);
                float f10 = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f10);
                frameLayout.setScaleY(f10);
                return;
            default:
                dg0 dg0Var2 = this.f40467b;
                dg0Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg0Var2.f33466f.setProgress(floatValue2);
                dg0Var2.d.setAlpha(floatValue2);
                dg0Var2.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = dg0Var2.f33470w;
                frameLayout2.setAlpha(floatValue2);
                float f11 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f11);
                frameLayout2.setScaleY(f11);
                return;
        }
    }
}
