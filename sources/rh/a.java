package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import ph.f6;
public final class a implements Utilities.Callback {
    public final int f43448a;
    public final k f43449b;

    public a(k kVar, int i10) {
        this.f43448a = i10;
        this.f43449b = kVar;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43448a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f6(10, this.f43449b, (TLRPC.UserFull) obj));
                return;
            case 1:
                k kVar = this.f43449b;
                kVar.V.commission_permille = ((Integer) obj).intValue();
                kVar.I0();
                return;
            default:
                k kVar2 = this.f43449b;
                kVar2.V.duration_months = ((Integer) kVar2.X.get(((Integer) obj).intValue())).intValue();
                kVar2.I0();
                return;
        }
    }
}
