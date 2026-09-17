package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;
public final class r1 implements Runnable {
    public final int f52534a;
    public final w3 f52535b;
    public final co f52536c;
    public final long d;

    public r1(w3 w3Var, co coVar, long j3, int i10) {
        this.f52534a = i10;
        this.f52535b = w3Var;
        this.f52536c = coVar;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f52534a;
        long j3 = this.d;
        co coVar = this.f52536c;
        w3 w3Var = this.f52535b;
        switch (i10) {
            case 0:
                qc M = yc.a0(coVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, w3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.f29717t = true;
                M.j();
                return;
            default:
                qc M2 = yc.a0(coVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, w3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.f29717t = true;
                M2.j();
                return;
        }
    }
}
