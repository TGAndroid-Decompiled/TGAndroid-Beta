package rh;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class y1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43855a;
    public final q2 f43856b;
    public final int f43857c;
    public final int d;

    public y1(q2 q2Var, int i10, int i11, int i12) {
        this.f43855a = i12;
        this.f43856b = q2Var;
        this.f43857c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z4;
        switch (this.f43855a) {
            case 0:
                q2 q2Var = this.f43856b;
                Paint paint = q2Var.M;
                paint.setColor(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f43857c, this.d));
                q2Var.A();
                q2Var.e.invalidate();
                org.telegram.ui.f3 f3Var = q2Var.R0;
                if (f3Var != null) {
                    if (AndroidUtilities.computePerceivedBrightness(paint.getColor()) <= 0.721f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    f3Var.b(z4, false);
                    q2Var.R0.setBackgroundColor(paint.getColor());
                }
                q2Var.F();
                return;
            default:
                q2 q2Var2 = this.f43856b;
                q2Var2.getClass();
                q2Var2.O = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f43857c, this.d);
                q2Var2.h();
                return;
        }
    }
}
