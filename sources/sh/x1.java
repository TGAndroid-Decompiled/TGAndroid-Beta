package sh;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f47775a;
    public final p2 f47776b;
    public final int f47777c;
    public final int d;

    public x1(p2 p2Var, int i10, int i11, int i12) {
        this.f47775a = i12;
        this.f47776b = p2Var;
        this.f47777c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z4;
        switch (this.f47775a) {
            case 0:
                p2 p2Var = this.f47776b;
                Paint paint = p2Var.M;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f47777c, this.d));
                p2Var.A();
                p2Var.f47588e.invalidate();
                org.telegram.ui.f3 f3Var = p2Var.R0;
                if (f3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    f3Var.b(z4, false);
                    p2Var.R0.setBackgroundColor(paint.getColor());
                }
                p2Var.F();
                return;
            default:
                p2 p2Var2 = this.f47776b;
                p2Var2.getClass();
                p2Var2.O = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f47777c, this.d);
                p2Var2.h();
                return;
        }
    }
}
