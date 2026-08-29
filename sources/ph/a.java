package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class a implements Utilities.Callback {
    public final int f45723a;
    public final j f45724b;

    public a(j jVar, int i10) {
        this.f45723a = i10;
        this.f45724b = jVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f45723a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(8, this.f45724b, (TLRPC.UserFull) obj));
                return;
            case 1:
                j jVar = this.f45724b;
                jVar.U.commission_permille = ((Integer) obj).intValue();
                jVar.I0();
                return;
            default:
                j jVar2 = this.f45724b;
                jVar2.U.duration_months = ((Integer) jVar2.W.get(((Integer) obj).intValue())).intValue();
                jVar2.I0();
                return;
        }
    }
}
