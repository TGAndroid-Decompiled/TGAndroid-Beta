package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.zn;
public final class s1 implements Runnable {
    public final int f48053a;
    public final y3 f48054b;
    public final zn f48055c;
    public final long d;

    public s1(y3 y3Var, zn znVar, long j3, int i10) {
        this.f48053a = i10;
        this.f48054b = y3Var;
        this.f48055c = znVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f48053a;
        long j3 = this.d;
        zn znVar = this.f48055c;
        y3 y3Var = this.f48054b;
        switch (i10) {
            case 0:
                pc M = xc.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, y3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f27321t = true;
                M.j();
                return;
            default:
                pc M2 = xc.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, y3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f27321t = true;
                M2.j();
                return;
        }
    }
}
