package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
public final class s1 implements Runnable {
    public final int f47719a;
    public final z3 f47720b;
    public final bo f47721c;
    public final long d;

    public s1(z3 z3Var, bo boVar, long j3, int i10) {
        this.f47719a = i10;
        this.f47720b = z3Var;
        this.f47721c = boVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f47719a;
        long j3 = this.d;
        bo boVar = this.f47721c;
        z3 z3Var = this.f47720b;
        switch (i10) {
            case 0:
                oc M = vc.a0(boVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, z3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f26761t = true;
                M.j();
                return;
            default:
                oc M2 = vc.a0(boVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, z3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f26761t = true;
                M2.j();
                return;
        }
    }
}
