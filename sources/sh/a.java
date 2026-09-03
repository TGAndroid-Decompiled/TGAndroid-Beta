package sh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import qh.l6;
public final class a implements Utilities.Callback {
    public final int f47382a;
    public final j f47383b;

    public a(j jVar, int i10) {
        this.f47382a = i10;
        this.f47383b = jVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47382a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l6(11, this.f47383b, (TLRPC.UserFull) obj));
                return;
            case 1:
                j jVar = this.f47383b;
                jVar.V.commission_permille = ((Integer) obj).intValue();
                jVar.I0();
                return;
            default:
                j jVar2 = this.f47383b;
                jVar2.V.duration_months = ((Integer) jVar2.X.get(((Integer) obj).intValue())).intValue();
                jVar2.I0();
                return;
        }
    }
}
