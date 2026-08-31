package qh;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ek;
public final class w0 implements Utilities.Callback {
    public final int f46213a;
    public final y1 f46214b;

    public w0(y1 y1Var, int i10) {
        this.f46213a = i10;
        this.f46214b = y1Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f46213a;
        y1 y1Var = this.f46214b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                y1.m(y1Var);
                return;
            case 1:
                ek ekVar = y1Var.f46345f;
                ValueAnimator valueAnimator = ekVar.N;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && ekVar.getCurrentPosition() != num.intValue()) {
                    ekVar.D(num.intValue());
                    x1 x1Var = y1Var.h;
                    x1Var.C = num.intValue();
                    x1Var.invalidate();
                    return;
                }
                return;
            default:
                int intValue = num.intValue();
                int i11 = y1.D;
                y1Var.p0(intValue);
                return;
        }
    }
}
