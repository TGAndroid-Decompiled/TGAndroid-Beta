package yh;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class m3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52919a;
    public final p3 f52920b;

    public m3(p3 p3Var, int i10) {
        this.f52919a = i10;
        this.f52920b = p3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52919a) {
            case 0:
                p3 p3Var = this.f52920b;
                p3Var.getClass();
                p3Var.f53069s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var.d(p3Var.U);
                return;
            case 1:
                p3 p3Var2 = this.f52920b;
                p3Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float w10 = com.google.android.gms.internal.vision.e2.w((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                p3Var2.f53070t0 = w10;
                FrameLayout frameLayout = p3Var2.f53046b;
                frameLayout.setScaleX(w10);
                frameLayout.setScaleY(p3Var2.f53070t0);
                p3Var2.invalidate();
                return;
            default:
                p3 p3Var3 = this.f52920b;
                p3Var3.getClass();
                p3Var3.f53069s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p3Var3.d(p3Var3.U);
                return;
        }
    }
}
