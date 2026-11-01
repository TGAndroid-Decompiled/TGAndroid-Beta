package th;

import android.animation.ValueAnimator;
public final class j1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49110a;
    public final z2 f49111b;

    public j1(z2 z2Var, int i10) {
        this.f49110a = i10;
        this.f49111b = z2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49110a) {
            case 0:
                z2 z2Var = this.f49111b;
                z2Var.getClass();
                z2Var.f49763q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var.invalidate();
                return;
            case 1:
                z2 z2Var2 = this.f49111b;
                z2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.f49712c3 = floatValue;
                z2Var2.f49706a3.setTransitionProgress(floatValue);
                return;
            default:
                z2.X(this.f49111b, valueAnimator);
                return;
        }
    }
}
