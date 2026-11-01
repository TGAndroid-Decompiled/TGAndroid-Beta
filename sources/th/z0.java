package th;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class z0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f49703a;
    public final a1 f49704b;

    public z0(a1 a1Var, int i10) {
        this.f49703a = i10;
        this.f49704b = a1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49703a) {
            case 0:
                this.f49704b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                a1 a1Var = this.f49704b;
                a1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var.f48788n = floatValue;
                View view = a1Var.f48785b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - a1Var.f48788n);
                view.setScaleY(1.0f - a1Var.f48788n);
                a1Var.f48786c.setColorFilter(new PorterDuffColorFilter(i0.b.f(a1Var.f48788n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                a1Var.f48784a.invalidate();
                return;
        }
    }
}
