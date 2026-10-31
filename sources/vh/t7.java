package vh;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
public final class t7 extends u0 {
    public final o8 f51981b0;

    public t7(o8 o8Var, Context context, boolean z10) {
        super(context, z10);
        this.f51981b0 = o8Var;
    }

    @Override
    public final void receivedAmplitude(double d) {
        r4 r4Var = this.f51981b0.O0;
        if (r4Var != null) {
            r4Var.f51860g0 = Utilities.i((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        o8 o8Var = this.f51981b0;
        o8Var.F0.setValue(isDual());
        b9 b9Var = o8Var.F0;
        if (isDual()) {
            i10 = 2131754886;
        } else {
            i10 = 2131754887;
        }
        b9Var.setContentDescription(cd.L0(i10, null));
        o8Var.d0(o8Var.B());
    }

    @Override
    public final void u(boolean z10) {
        o8 o8Var = this.f51981b0;
        o8Var.f51649o1.b(o8Var.f51613c1.getText());
        o8Var.f51649o1.a(false, z10, o8Var.f51637k0);
    }
}
