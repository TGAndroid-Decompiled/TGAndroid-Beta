package xh;

import android.animation.ValueAnimator;
import android.graphics.Paint;
public final class o1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f53956a;
    public final m2 f53957b;
    public final int f53958c;
    public final int d;

    public o1(m2 m2Var, int i10, int i11, int i12) {
        this.f53956a = i12;
        this.f53957b = m2Var;
        this.f53958c = i10;
        this.d = i11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.f53956a) {
            case 0:
                m2 m2Var = this.f53957b;
                Paint paint = m2Var.Q;
                paint.setColor(i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f53958c, this.d));
                m2Var.F();
                m2Var.f53899f.invalidate();
                org.telegram.ui.b3 b3Var = m2Var.Y0;
                if (b3Var != null) {
                    if (org.telegram.messenger.i0.B(paint.getColor()) <= 0.721f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b3Var.b(z10, false);
                    m2Var.Y0.setBackgroundColor(paint.getColor());
                }
                m2Var.K();
                return;
            default:
                m2 m2Var2 = this.f53957b;
                m2Var2.getClass();
                m2Var2.S = i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f53958c, this.d);
                m2Var2.l();
                return;
        }
    }
}
