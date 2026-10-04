package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;
public final class s1 implements Runnable {
    public final int f51958a;
    public final x3 f51959b;
    public final yn f51960c;
    public final long d;

    public s1(x3 x3Var, yn ynVar, long j3, int i10) {
        this.f51958a = i10;
        this.f51959b = x3Var;
        this.f51960c = ynVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f51958a;
        long j3 = this.d;
        yn ynVar = this.f51960c;
        x3 x3Var = this.f51959b;
        switch (i10) {
            case 0:
                rc M = yc.a0(ynVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f30355t = true;
                M.j();
                return;
            default:
                rc M2 = yc.a0(ynVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f30355t = true;
                M2.j();
                return;
        }
    }
}
