package zh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52497a;
    public final t3 f52498b;

    public q3(t3 t3Var, int i10) {
        this.f52497a = i10;
        this.f52498b = t3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52497a) {
            case 0:
                t3 t3Var = this.f52498b;
                t3Var.getClass();
                t3Var.f52671s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3Var.d(t3Var.U);
                return;
            case 1:
                t3 t3Var2 = this.f52498b;
                t3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                t3Var2.f52672t0 = x10;
                FrameLayout frameLayout = t3Var2.f52648b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(t3Var2.f52672t0);
                t3Var2.invalidate();
                return;
            default:
                t3 t3Var3 = this.f52498b;
                t3Var3.getClass();
                t3Var3.f52671s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3Var3.d(t3Var3.U);
                return;
        }
    }
}
