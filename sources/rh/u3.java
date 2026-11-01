package rh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class u3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47544a;
    public final y3 f47545b;

    public u3(y3 y3Var, int i10) {
        this.f47544a = i10;
        this.f47545b = y3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47544a) {
            case 0:
                y3 y3Var = this.f47545b;
                y3Var.getClass();
                y3Var.f47755v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var.d(y3Var.f47729a0);
                return;
            case 1:
                y3 y3Var2 = this.f47545b;
                y3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float u10 = c3.i0.u((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                y3Var2.f47757w0 = u10;
                FrameLayout frameLayout = y3Var2.f47730b;
                frameLayout.setScaleX(u10);
                frameLayout.setScaleY(y3Var2.f47757w0);
                y3Var2.invalidate();
                return;
            default:
                y3 y3Var3 = this.f47545b;
                y3Var3.getClass();
                y3Var3.f47755v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var3.d(y3Var3.f47729a0);
                return;
        }
    }
}
