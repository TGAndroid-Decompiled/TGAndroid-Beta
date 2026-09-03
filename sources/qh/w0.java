package qh;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ek;
public final class w0 implements Utilities.Callback {
    public final int f46229a;
    public final x1 f46230b;

    public w0(x1 x1Var, int i10) {
        this.f46229a = i10;
        this.f46230b = x1Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f46229a;
        x1 x1Var = this.f46230b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                x1.m(x1Var);
                return;
            case 1:
                ek ekVar = x1Var.f46301f;
                ValueAnimator valueAnimator = ekVar.N;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && ekVar.getCurrentPosition() != num.intValue()) {
                    ekVar.D(num.intValue());
                    w1 w1Var = x1Var.h;
                    w1Var.C = num.intValue();
                    w1Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i11 = x1.D;
                x1Var.p0(intValue);
                return;
        }
    }
}
