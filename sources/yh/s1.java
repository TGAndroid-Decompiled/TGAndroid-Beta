package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.xn;
public final class s1 implements Runnable {
    public final int f47679a;
    public final y3 f47680b;
    public final xn f47681c;
    public final long d;

    public s1(y3 y3Var, xn xnVar, long j3, int i10) {
        this.f47679a = i10;
        this.f47680b = y3Var;
        this.f47681c = xnVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f47679a;
        long j3 = this.d;
        xn xnVar = this.f47681c;
        y3 y3Var = this.f47680b;
        switch (i10) {
            case 0:
                qc M = xc.a0(xnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, y3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f27316t = true;
                M.j();
                return;
            default:
                qc M2 = xc.a0(xnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, y3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f27316t = true;
                M2.j();
                return;
        }
    }
}
