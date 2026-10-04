package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;
public final class s1 implements Runnable {
    public final int f51952a;
    public final x3 f51953b;
    public final yn f51954c;
    public final long d;

    public s1(x3 x3Var, yn ynVar, long j3, int i10) {
        this.f51952a = i10;
        this.f51953b = x3Var;
        this.f51954c = ynVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f51952a;
        long j3 = this.d;
        yn ynVar = this.f51954c;
        x3 x3Var = this.f51953b;
        switch (i10) {
            case 0:
                rc M = yc.a0(ynVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f30348t = true;
                M.j();
                return;
            default:
                rc M2 = yc.a0(ynVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f30348t = true;
                M2.j();
                return;
        }
    }
}
