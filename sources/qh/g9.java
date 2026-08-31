package qh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class g9 extends v0 {
    public final ca V;

    public g9(ca caVar, Context context, boolean z4) {
        super(context, z4);
        this.V = caVar;
    }

    @Override
    public final void receivedAmplitude(double d) {
        r5 r5Var = this.V.L0;
        if (r5Var != null) {
            r5Var.f45952d0 = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
        }
    }

    @Override
    public final void toggleDual() {
        int i10;
        super.toggleDual();
        ca caVar = this.V;
        caVar.C0.setValue(isDual());
        oa oaVar = caVar.C0;
        if (isDual()) {
            i10 = R.string.AccDescrDualCameraOn;
        } else {
            i10 = R.string.AccDescrDualCameraOff;
        }
        oaVar.setContentDescription(LocaleController.getString(i10));
        caVar.e0(caVar.C());
    }

    @Override
    public final void u(boolean z4) {
        ca caVar = this.V;
        caVar.l1.b(caVar.Z0.getText());
        caVar.l1.a(false, z4, caVar.f45099h0);
    }
}
