package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
public final class p1 implements Runnable {
    public final int f50975a;
    public final r3 f50976b;
    public final fo f50977c;
    public final long d;

    public p1(r3 r3Var, fo foVar, long j10, int i10) {
        this.f50975a = i10;
        this.f50976b = r3Var;
        this.f50977c = foVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f50975a;
        long j10 = this.d;
        fo foVar = this.f50977c;
        r3 r3Var = this.f50976b;
        switch (i10) {
            case 0:
                sc M = zc.a0(foVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, r3Var.D1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.f28815t = true;
                M.j();
                return;
            default:
                sc M2 = zc.a0(foVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, r3Var.D1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.f28815t = true;
                M2.j();
                return;
        }
    }
}
