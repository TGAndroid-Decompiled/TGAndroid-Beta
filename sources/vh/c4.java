package vh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r20;
public final class c4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51048a;
    public final View f51049b;

    public c4(int i10, View view) {
        this.f51048a = i10;
        this.f51049b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51048a) {
            case 0:
                f4 f4Var = (f4) this.f51049b;
                f4Var.getClass();
                f4Var.f51150n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.e();
                return;
            case 1:
                e4 e4Var = (e4) this.f51049b;
                e4Var.getClass();
                e4Var.f51124w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e4Var.invalidate();
                return;
            case 2:
                v4 v4Var = (v4) this.f51049b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v4Var.E = floatValue;
                u4 u4Var = v4Var.f52058a;
                u4Var.setScaleX(1.0f - floatValue);
                u4Var.setScaleY(1.0f - v4Var.E);
                v4Var.invalidate();
                return;
            case 3:
                w5 w5Var = (w5) this.f51049b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.f52113r = floatValue2;
                r20 r20Var = w5Var.f52117y;
                if (r20Var != null) {
                    r20Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                w5Var.f52108a.invalidate();
                return;
            case 4:
                ((r6) this.f51049b).f51880y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                t6 t6Var = (t6) this.f51049b;
                t6Var.getClass();
                t6Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
