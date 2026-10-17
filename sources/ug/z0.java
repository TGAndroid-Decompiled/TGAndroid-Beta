package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class z0 implements Utilities.Callback {
    public final int f47842a;
    public final l1 f47843b;

    public z0(l1 l1Var, int i10) {
        this.f47842a = i10;
        this.f47843b = l1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47842a) {
            case 0:
                l1 l1Var = this.f47843b;
                ArrayList arrayList = l1Var.f47738r0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                h1 h1Var = l1Var.Y;
                if (h1Var.N) {
                    h1Var.setLoading(false);
                    if (l1Var.d.G) {
                        l1Var.e0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f47843b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                l1.U(this.f47843b, (TL_account.TL_birthday) obj);
                return;
            default:
                l1 l1Var2 = this.f47843b;
                l1Var2.f47735o0 = (String) obj;
                p4.s0 s0Var = l1Var2.f47743w0;
                AndroidUtilities.cancelRunOnUIThread(s0Var);
                AndroidUtilities.runOnUIThread(s0Var, 350L);
                return;
        }
    }
}
