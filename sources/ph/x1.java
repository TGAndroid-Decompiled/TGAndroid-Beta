package ph;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46150a;
    public final p2 f46151b;
    public final int f46152c;
    public final int d;

    public x1(p2 p2Var, int i10, int i11, int i12) {
        this.f46150a = i12;
        this.f46151b = p2Var;
        this.f46152c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f46150a) {
            case 0:
                p2 p2Var = this.f46151b;
                Paint paint = p2Var.L;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f46152c, this.d));
                p2Var.A();
                p2Var.f45963e.invalidate();
                org.telegram.ui.h3 h3Var = p2Var.Q0;
                if (h3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h3Var.b(z10, false);
                    p2Var.Q0.setBackgroundColor(paint.getColor());
                }
                p2Var.F();
                return;
            default:
                p2 p2Var2 = this.f46151b;
                p2Var2.getClass();
                p2Var2.N = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f46152c, this.d);
                p2Var2.h();
                return;
        }
    }
}
