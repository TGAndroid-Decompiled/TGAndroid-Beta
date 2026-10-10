package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.tc;
import org.telegram.ui.zn;
public final class q1 implements Runnable {
    public final int f53101a;
    public final s3 f53102b;
    public final zn f53103c;
    public final long d;

    public q1(s3 s3Var, zn znVar, long j3, int i10) {
        this.f53101a = i10;
        this.f53102b = s3Var;
        this.f53103c = znVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f53101a;
        long j3 = this.d;
        zn znVar = this.f53103c;
        s3 s3Var = this.f53102b;
        switch (i10) {
            case 0:
                tc M = ad.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, s3Var.D1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f31106t = true;
                M.j();
                return;
            default:
                tc M2 = ad.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, s3Var.D1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f31106t = true;
                M2.j();
                return;
        }
    }
}
