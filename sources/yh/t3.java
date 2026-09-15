package yh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class t3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47819a;
    public final x3 f47820b;

    public t3(x3 x3Var, int i10) {
        this.f47819a = i10;
        this.f47820b = x3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47819a) {
            case 0:
                x3 x3Var = this.f47820b;
                x3Var.getClass();
                x3Var.f47987s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.d(x3Var.U);
                return;
            case 1:
                x3 x3Var2 = this.f47820b;
                x3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                x3Var2.f47988t0 = x10;
                FrameLayout frameLayout = x3Var2.f47965b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(x3Var2.f47988t0);
                x3Var2.invalidate();
                return;
            default:
                x3 x3Var3 = this.f47820b;
                x3Var3.getClass();
                x3Var3.f47987s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var3.d(x3Var3.U);
                return;
        }
    }
}
