package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Wallet.m4;
public final class z0 implements Utilities.Callback {
    public final int f48267a;
    public final l1 f48268b;

    public z0(l1 l1Var, int i10) {
        this.f48267a = i10;
        this.f48268b = l1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48267a) {
            case 0:
                l1 l1Var = this.f48268b;
                ArrayList arrayList = l1Var.f48163r0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                h1 h1Var = l1Var.Y;
                if (h1Var.Q) {
                    h1Var.setLoading(false);
                    if (l1Var.d.G) {
                        l1Var.d0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f48268b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                l1.T(this.f48268b, (TL_account.TL_birthday) obj);
                return;
            default:
                l1 l1Var2 = this.f48268b;
                l1Var2.f48160o0 = (String) obj;
                m4 m4Var = l1Var2.f48168w0;
                AndroidUtilities.cancelRunOnUIThread(m4Var);
                AndroidUtilities.runOnUIThread(m4Var, 350L);
                return;
        }
    }
}
