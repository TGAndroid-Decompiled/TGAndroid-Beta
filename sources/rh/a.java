package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import ph.e6;
public final class a implements Utilities.Callback {
    public final int f43516a;
    public final j f43517b;

    public a(j jVar, int i10) {
        this.f43516a = i10;
        this.f43517b = jVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43516a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e6(12, this.f43517b, (TLRPC.UserFull) obj));
                return;
            case 1:
                j jVar = this.f43517b;
                jVar.V.commission_permille = ((Integer) obj).intValue();
                jVar.I0();
                return;
            default:
                j jVar2 = this.f43517b;
                jVar2.V.duration_months = ((Integer) jVar2.X.get(((Integer) obj).intValue())).intValue();
                jVar2.I0();
                return;
        }
    }
}
