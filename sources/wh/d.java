package wh;

import android.animation.ValueAnimator;
import o4.h0;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
import ph.z8;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f46656a;
    public final Object f46657b;
    public final Object f46658c;

    public d(int i10, Object obj, Object obj2) {
        this.f46656a = i10;
        this.f46657b = obj;
        this.f46658c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46656a) {
            case 0:
                ((u0) this.f46657b).f22361c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((v0) this.f46658c).invalidate();
                return;
            default:
                h0 h0Var = (h0) this.f46657b;
                h0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h0Var.f16330b = intValue;
                ((z8) this.f46658c).c(intValue);
                return;
        }
    }
}
