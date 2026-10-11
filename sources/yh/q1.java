package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.sc;
import org.telegram.ui.zn;
public final class q1 implements Runnable {
    public final int f53144a;
    public final s3 f53145b;
    public final zn f53146c;
    public final long d;

    public q1(s3 s3Var, zn znVar, long j3, int i10) {
        this.f53144a = i10;
        this.f53145b = s3Var;
        this.f53146c = znVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f53144a;
        long j3 = this.d;
        zn znVar = this.f53146c;
        s3 s3Var = this.f53145b;
        switch (i10) {
            case 0:
                sc M = ad.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, s3Var.D1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f30721t = true;
                M.j();
                return;
            default:
                sc M2 = ad.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, s3Var.D1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f30721t = true;
                M2.j();
                return;
        }
    }
}
