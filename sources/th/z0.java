package th;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class z0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49689a;
    public final a1 f49690b;

    public z0(a1 a1Var, int i10) {
        this.f49689a = i10;
        this.f49690b = a1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49689a) {
            case 0:
                this.f49690b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                a1 a1Var = this.f49690b;
                a1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var.f48774n = floatValue;
                View view = a1Var.f48771b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - a1Var.f48774n);
                view.setScaleY(1.0f - a1Var.f48774n);
                a1Var.f48772c.setColorFilter(new PorterDuffColorFilter(i0.b.f(a1Var.f48774n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                a1Var.f48770a.invalidate();
                return;
        }
    }
}
