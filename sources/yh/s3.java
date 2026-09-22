package yh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class s3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47724a;
    public final w3 f47725b;

    public s3(w3 w3Var, int i10) {
        this.f47724a = i10;
        this.f47725b = w3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47724a) {
            case 0:
                w3 w3Var = this.f47725b;
                w3Var.getClass();
                w3Var.f47894s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.d(w3Var.U);
                return;
            case 1:
                w3 w3Var2 = this.f47725b;
                w3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                w3Var2.f47895t0 = x10;
                FrameLayout frameLayout = w3Var2.f47872b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(w3Var2.f47895t0);
                w3Var2.invalidate();
                return;
            default:
                w3 w3Var3 = this.f47725b;
                w3Var3.getClass();
                w3Var3.f47894s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var3.d(w3Var3.U);
                return;
        }
    }
}
