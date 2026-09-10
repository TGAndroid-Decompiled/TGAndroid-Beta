package xh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45922a;
    public final u3 f45923b;

    public q3(u3 u3Var, int i10) {
        this.f45922a = i10;
        this.f45923b = u3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45922a) {
            case 0:
                u3 u3Var = this.f45923b;
                u3Var.getClass();
                u3Var.f46121s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3Var.d(u3Var.U);
                return;
            case 1:
                u3 u3Var2 = this.f45923b;
                u3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float x10 = com.google.android.gms.internal.vision.e2.x((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                u3Var2.f46122t0 = x10;
                FrameLayout frameLayout = u3Var2.f46099b;
                frameLayout.setScaleX(x10);
                frameLayout.setScaleY(u3Var2.f46122t0);
                u3Var2.invalidate();
                return;
            default:
                u3 u3Var3 = this.f45923b;
                u3Var3.getClass();
                u3Var3.f46121s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u3Var3.d(u3Var3.U);
                return;
        }
    }
}
