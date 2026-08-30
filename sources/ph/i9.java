package ph;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class i9 extends v0 {
    public final da V;

    public i9(da daVar, Context context, boolean z4) {
        super(context, z4);
        this.V = daVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        t5 t5Var = this.V.L0;
        if (t5Var != null) {
            t5Var.f42338d0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        da daVar = this.V;
        daVar.C0.setValue(isDual());
        qa qaVar = daVar.C0;
        if (isDual()) {
            i10 = R.string.AccDescrDualCameraOn;
        } else {
            i10 = R.string.AccDescrDualCameraOff;
        }
        qaVar.setContentDescription(LocaleController.getString(i10));
        daVar.e0(daVar.C());
    }

    @Override
    public final void u(boolean z4) {
        da daVar = this.V;
        daVar.l1.b(daVar.Z0.getText());
        daVar.l1.a(false, z4, daVar.f41496h0);
    }
}
