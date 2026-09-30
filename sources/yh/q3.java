package yh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48010a;
    public final u3 f48011b;

    public q3(u3 u3Var, int i10) {
        this.f48010a = i10;
        this.f48011b = u3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48010a) {
            case 0:
                u3 u3Var = this.f48011b;
                u3Var.getClass();
                u3Var.f48212s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3Var.d(u3Var.U);
                return;
            case 1:
                u3 u3Var2 = this.f48011b;
                u3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                u3Var2.f48213t0 = x10;
                FrameLayout frameLayout = u3Var2.f48190b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(u3Var2.f48213t0);
                u3Var2.invalidate();
                return;
            default:
                u3 u3Var3 = this.f48011b;
                u3Var3.getClass();
                u3Var3.f48212s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3Var3.d(u3Var3.U);
                return;
        }
    }
}
