package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.eo;
public final class t1 implements Runnable {
    public final int f46046a;
    public final x3 f46047b;
    public final eo f46048c;
    public final long d;

    public t1(x3 x3Var, eo eoVar, long j3, int i10) {
        this.f46046a = i10;
        this.f46047b = x3Var;
        this.f46048c = eoVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f46046a;
        long j3 = this.d;
        eo eoVar = this.f46048c;
        x3 x3Var = this.f46047b;
        switch (i10) {
            case 0:
                pc M = wc.a0(eoVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f26091t = true;
                M.j();
                return;
            default:
                pc M2 = wc.a0(eoVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f26091t = true;
                M2.j();
                return;
        }
    }
}
