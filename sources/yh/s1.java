package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.xn;
public final class s1 implements Runnable {
    public final int f48046a;
    public final x3 f48047b;
    public final xn f48048c;
    public final long d;

    public s1(x3 x3Var, xn xnVar, long j3, int i10) {
        this.f48046a = i10;
        this.f48047b = x3Var;
        this.f48048c = xnVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f48046a;
        long j3 = this.d;
        xn xnVar = this.f48048c;
        x3 x3Var = this.f48047b;
        switch (i10) {
            case 0:
                qc M = xc.a0(xnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f27701t = true;
                M.j();
                return;
            default:
                qc M2 = xc.a0(xnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f27701t = true;
                M2.j();
                return;
        }
    }
}
