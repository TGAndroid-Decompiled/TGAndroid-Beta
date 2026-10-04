package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;
public final class s1 implements Runnable {
    public final int f51953a;
    public final x3 f51954b;
    public final yn f51955c;
    public final long d;

    public s1(x3 x3Var, yn ynVar, long j3, int i10) {
        this.f51953a = i10;
        this.f51954b = x3Var;
        this.f51955c = ynVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f51953a;
        long j3 = this.d;
        yn ynVar = this.f51955c;
        x3 x3Var = this.f51954b;
        switch (i10) {
            case 0:
                rc M = yc.a0(ynVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f30349t = true;
                M.j();
                return;
            default:
                rc M2 = yc.a0(ynVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f30349t = true;
                M2.j();
                return;
        }
    }
}
