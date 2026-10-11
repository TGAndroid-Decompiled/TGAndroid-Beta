package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.sc;
import org.telegram.ui.zn;
public final class q1 implements Runnable {
    public final int f53178a;
    public final s3 f53179b;
    public final zn f53180c;
    public final long d;

    public q1(s3 s3Var, zn znVar, long j3, int i10) {
        this.f53178a = i10;
        this.f53179b = s3Var;
        this.f53180c = znVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f53178a;
        long j3 = this.d;
        zn znVar = this.f53180c;
        s3 s3Var = this.f53179b;
        switch (i10) {
            case 0:
                sc M = ad.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, s3Var.D1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f30843t = true;
                M.j();
                return;
            default:
                sc M2 = ad.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, s3Var.D1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f30843t = true;
                M2.j();
                return;
        }
    }
}
