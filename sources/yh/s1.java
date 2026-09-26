package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.wn;
public final class s1 implements Runnable {
    public final int f48000a;
    public final x3 f48001b;
    public final wn f48002c;
    public final long d;

    public s1(x3 x3Var, wn wnVar, long j3, int i10) {
        this.f48000a = i10;
        this.f48001b = x3Var;
        this.f48002c = wnVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f48000a;
        long j3 = this.d;
        wn wnVar = this.f48002c;
        x3 x3Var = this.f48001b;
        switch (i10) {
            case 0:
                qc M = xc.a0(wnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f27645t = true;
                M.j();
                return;
            default:
                qc M2 = xc.a0(wnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f27645t = true;
                M2.j();
                return;
        }
    }
}
