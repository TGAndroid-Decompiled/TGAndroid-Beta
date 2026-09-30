package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.wn;
public final class s1 implements Runnable {
    public final int f48109a;
    public final x3 f48110b;
    public final wn f48111c;
    public final long d;

    public s1(x3 x3Var, wn wnVar, long j3, int i10) {
        this.f48109a = i10;
        this.f48110b = x3Var;
        this.f48111c = wnVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f48109a;
        long j3 = this.d;
        wn wnVar = this.f48111c;
        x3 x3Var = this.f48110b;
        switch (i10) {
            case 0:
                rc M = yc.a0(wnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f27956t = true;
                M.j();
                return;
            default:
                rc M2 = yc.a0(wnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f27956t = true;
                M2.j();
                return;
        }
    }
}
