package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.tc;
import org.telegram.ui.zn;
public final class q1 implements Runnable {
    public final int f53055a;
    public final s3 f53056b;
    public final zn f53057c;
    public final long d;

    public q1(s3 s3Var, zn znVar, long j3, int i10) {
        this.f53055a = i10;
        this.f53056b = s3Var;
        this.f53057c = znVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f53055a;
        long j3 = this.d;
        zn znVar = this.f53057c;
        s3 s3Var = this.f53056b;
        switch (i10) {
            case 0:
                tc M = ad.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, s3Var.D1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f31140t = true;
                M.j();
                return;
            default:
                tc M2 = ad.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, s3Var.D1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f31140t = true;
                M2.j();
                return;
        }
    }
}
