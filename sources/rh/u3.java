package rh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class u3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47537a;
    public final y3 f47538b;

    public u3(y3 y3Var, int i10) {
        this.f47537a = i10;
        this.f47538b = y3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47537a) {
            case 0:
                y3 y3Var = this.f47538b;
                y3Var.getClass();
                y3Var.f47743v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var.d(y3Var.f47717a0);
                return;
            case 1:
                y3 y3Var2 = this.f47538b;
                y3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float u10 = c3.i0.u((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                y3Var2.f47745w0 = u10;
                FrameLayout frameLayout = y3Var2.f47718b;
                frameLayout.setScaleX(u10);
                frameLayout.setScaleY(y3Var2.f47745w0);
                y3Var2.invalidate();
                return;
            default:
                y3 y3Var3 = this.f47538b;
                y3Var3.getClass();
                y3Var3.f47743v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var3.d(y3Var3.f47717a0);
                return;
        }
    }
}
