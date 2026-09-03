package qh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class f9 extends v0 {
    public final ba V;

    public f9(ba baVar, Context context, boolean z4) {
        super(context, z4);
        this.V = baVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        q5 q5Var = this.V.L0;
        if (q5Var != null) {
            q5Var.f45931d0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        ba baVar = this.V;
        baVar.C0.setValue(isDual());
        na naVar = baVar.C0;
        if (isDual()) {
            i10 = R.string.AccDescrDualCameraOn;
        } else {
            i10 = R.string.AccDescrDualCameraOff;
        }
        naVar.setContentDescription(LocaleController.getString(i10));
        baVar.e0(baVar.C());
    }

    @Override
    public final void u(boolean z4) {
        ba baVar = this.V;
        baVar.l1.b(baVar.Z0.getText());
        baVar.l1.a(false, z4, baVar.f45065h0);
    }
}
