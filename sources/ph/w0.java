package ph;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ek;
public final class w0 implements Utilities.Callback {
    public final int f42494a;
    public final y1 f42495b;

    public w0(y1 y1Var, int i10) {
        this.f42494a = i10;
        this.f42495b = y1Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f42494a;
        y1 y1Var = this.f42495b;
        Integer num = (Integer) obj;
        switch (i10) {
            case 0:
                y1.m(y1Var);
                return;
            case 1:
                ek ekVar = y1Var.f42605f;
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
