package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
public final class s1 implements Runnable {
    public final int f47762a;
    public final a4 f47763b;
    public final bo f47764c;
    public final long d;

    public s1(a4 a4Var, bo boVar, long j3, int i10) {
        this.f47762a = i10;
        this.f47763b = a4Var;
        this.f47764c = boVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f47762a;
        long j3 = this.d;
        bo boVar = this.f47764c;
        a4 a4Var = this.f47763b;
        switch (i10) {
            case 0:
                oc M = vc.a0(boVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, a4Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f26764t = true;
                M.j();
                return;
            default:
                oc M2 = vc.a0(boVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, a4Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f26764t = true;
                M2.j();
                return;
        }
    }
}
