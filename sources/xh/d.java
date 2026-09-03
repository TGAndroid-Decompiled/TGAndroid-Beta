package xh;

import android.animation.ValueAnimator;
import o4.h0;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f50640a;
    public final Object f50641b;
    public final Object f50642c;

    public d(int i10, Object obj, Object obj2) {
        this.f50640a = i10;
        this.f50641b = obj;
        this.f50642c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50640a) {
            case 0:
                ((u0) this.f50641b).f24187c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((v0) this.f50642c).invalidate();
                return;
            default:
                h0 h0Var = (h0) this.f50641b;
                h0Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h0Var.f16495a = intValue;
                ((sf.h) this.f50642c).c(intValue);
                return;
        }
    }
}
