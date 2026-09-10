package zh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class a1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f48151a;
    public final b1 f48152b;

    public a1(b1 b1Var, int i10) {
        this.f48151a = i10;
        this.f48152b = b1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48151a) {
            case 0:
                this.f48152b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                b1 b1Var = this.f48152b;
                b1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.f48298n = floatValue;
                View view = b1Var.f48295b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - b1Var.f48298n);
                view.setScaleY(1.0f - b1Var.f48298n);
                b1Var.f48296c.setColorFilter(new PorterDuffColorFilter(i0.a.d(b1Var.f48298n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                b1Var.f48294a.invalidate();
                return;
        }
    }
}
