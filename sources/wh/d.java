package wh;

import android.animation.ValueAnimator;
import o4.h0;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f46587a;
    public final Object f46588b;
    public final Object f46589c;

    public d(int i10, Object obj, Object obj2) {
        this.f46587a = i10;
        this.f46588b = obj;
        this.f46589c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46587a) {
            case 0:
                ((u0) this.f46588b).f22380c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((v0) this.f46589c).invalidate();
                return;
            default:
                h0 h0Var = (h0) this.f46588b;
                h0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h0Var.f16348b = intValue;
                ((rh.e) this.f46589c).c(intValue);
                return;
        }
    }
}
