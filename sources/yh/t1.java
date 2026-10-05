package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;
public final class t1 implements Runnable {
    public final int f52010a;
    public final y3 f52011b;
    public final yn f52012c;
    public final long d;

    public t1(y3 y3Var, yn ynVar, long j3, int i10) {
        this.f52010a = i10;
        this.f52011b = y3Var;
        this.f52012c = ynVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f52010a;
        long j3 = this.d;
        yn ynVar = this.f52012c;
        y3 y3Var = this.f52011b;
        switch (i10) {
            case 0:
                rc M = yc.a0(ynVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, y3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f30437t = true;
                M.j();
                return;
            default:
                rc M2 = yc.a0(ynVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, y3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f30437t = true;
                M2.j();
                return;
        }
    }
}
