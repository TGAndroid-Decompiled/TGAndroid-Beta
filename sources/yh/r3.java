package yh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class r3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47636a;
    public final v3 f47637b;

    public r3(v3 v3Var, int i10) {
        this.f47636a = i10;
        this.f47637b = v3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47636a) {
            case 0:
                v3 v3Var = this.f47637b;
                v3Var.getClass();
                v3Var.f47826s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var.d(v3Var.U);
                return;
            case 1:
                v3 v3Var2 = this.f47637b;
                v3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                v3Var2.f47827t0 = x10;
                FrameLayout frameLayout = v3Var2.f47804b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(v3Var2.f47827t0);
                v3Var2.invalidate();
                return;
            default:
                v3 v3Var3 = this.f47637b;
                v3Var3.getClass();
                v3Var3.f47826s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v3Var3.d(v3Var3.U);
                return;
        }
    }
}
