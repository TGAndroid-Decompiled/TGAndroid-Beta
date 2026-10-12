package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.eo;
public final class q1 implements Runnable {
    public final int f53281a;
    public final s3 f53282b;
    public final eo f53283c;
    public final long d;

    public q1(s3 s3Var, eo eoVar, long j3, int i10) {
        this.f53281a = i10;
        this.f53282b = s3Var;
        this.f53283c = eoVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f53281a;
        long j3 = this.d;
        eo eoVar = this.f53283c;
        s3 s3Var = this.f53282b;
        switch (i10) {
            case 0:
                sc M = zc.a0(eoVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, s3Var.D1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f30550t = true;
                M.j();
                return;
            default:
                sc M2 = zc.a0(eoVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, s3Var.D1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f30550t = true;
                M2.j();
                return;
        }
    }
}
