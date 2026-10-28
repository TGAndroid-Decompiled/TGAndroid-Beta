package vg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.dy0;
public final class b1 implements Utilities.Callback {
    public final int f50183a;
    public final n1 f50184b;

    public b1(n1 n1Var, int i10) {
        this.f50183a = i10;
        this.f50184b = n1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50183a) {
            case 0:
                n1 n1Var = this.f50184b;
                ArrayList arrayList = n1Var.f50260r0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                j1 j1Var = n1Var.Y;
                if (j1Var.Q) {
                    j1Var.setLoading(false);
                    if (n1Var.d.G) {
                        n1Var.d0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f50184b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                n1.T(this.f50184b, (TL_account.TL_birthday) obj);
                return;
            default:
                n1 n1Var2 = this.f50184b;
                n1Var2.f50257o0 = (String) obj;
                dy0 dy0Var = n1Var2.f50265w0;
                AndroidUtilities.cancelRunOnUIThread(dy0Var);
                AndroidUtilities.runOnUIThread(dy0Var, 350L);
                return;
        }
    }
}
