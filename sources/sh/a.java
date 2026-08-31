package sh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import qh.d6;
public final class a implements Utilities.Callback {
    public final int f47346a;
    public final j f47347b;

    public a(j jVar, int i10) {
        this.f47346a = i10;
        this.f47347b = jVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47346a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d6(12, this.f47347b, (TLRPC.UserFull) obj));
                return;
            case 1:
                j jVar = this.f47347b;
                jVar.V.commission_permille = ((Integer) obj).intValue();
                jVar.I0();
                return;
            default:
                j jVar2 = this.f47347b;
                jVar2.V.duration_months = ((Integer) jVar2.X.get(((Integer) obj).intValue())).intValue();
                jVar2.I0();
                return;
        }
    }
}
