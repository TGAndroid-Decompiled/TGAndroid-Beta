package th;

import android.animation.ValueAnimator;
public final class j1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49096a;
    public final z2 f49097b;

    public j1(z2 z2Var, int i10) {
        this.f49096a = i10;
        this.f49097b = z2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49096a) {
            case 0:
                z2 z2Var = this.f49097b;
                z2Var.getClass();
                z2Var.f49749q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var.invalidate();
                return;
            case 1:
                z2 z2Var2 = this.f49097b;
                z2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z2Var2.f49698c3 = floatValue;
                z2Var2.f49692a3.setTransitionProgress(floatValue);
                return;
            default:
                z2.X(this.f49097b, valueAnimator);
                return;
        }
    }
}
