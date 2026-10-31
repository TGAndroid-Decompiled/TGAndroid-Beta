package vh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q20;
public final class c4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51030a;
    public final View f51031b;

    public c4(int i10, View view) {
        this.f51030a = i10;
        this.f51031b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f51030a) {
            case 0:
                f4 f4Var = (f4) this.f51031b;
                f4Var.getClass();
                f4Var.f51135n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.e();
                return;
            case 1:
                e4 e4Var = (e4) this.f51031b;
                e4Var.getClass();
                e4Var.f51109w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e4Var.invalidate();
                return;
            case 2:
                v4 v4Var = (v4) this.f51031b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v4Var.E = floatValue;
                u4 u4Var = v4Var.f52042a;
                u4Var.setScaleX(1.0f - floatValue);
                u4Var.setScaleY(1.0f - v4Var.E);
                v4Var.invalidate();
                return;
            case 3:
                w5 w5Var = (w5) this.f51031b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.f52095r = floatValue2;
                q20 q20Var = w5Var.f52099y;
                if (q20Var != null) {
                    q20Var.a(Float.valueOf(Utilities.i(floatValue2, 1.0f, -1.0f)));
                }
                w5Var.f52090a.invalidate();
                return;
            case 4:
                ((r6) this.f51031b).f51895y.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                t6 t6Var = (t6) this.f51031b;
                t6Var.getClass();
                t6Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
