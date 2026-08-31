package xh;

import android.animation.ValueAnimator;
import o4.h0;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f50603a;
    public final Object f50604b;
    public final Object f50605c;

    public d(int i10, Object obj, Object obj2) {
        this.f50603a = i10;
        this.f50604b = obj;
        this.f50605c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50603a) {
            case 0:
                ((u0) this.f50604b).f24185c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((v0) this.f50605c).invalidate();
                return;
            default:
                h0 h0Var = (h0) this.f50604b;
                h0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h0Var.f16493a = intValue;
                ((sf.g) this.f50605c).c(intValue);
                return;
        }
    }
}
