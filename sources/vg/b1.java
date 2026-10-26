package vg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cy0;
public final class b1 implements Utilities.Callback {
    public final int f50148a;
    public final n1 f50149b;

    public b1(n1 n1Var, int i10) {
        this.f50148a = i10;
        this.f50149b = n1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50148a) {
            case 0:
                n1 n1Var = this.f50149b;
                ArrayList arrayList = n1Var.f50225r0;
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
                this.f50149b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                n1.T(this.f50149b, (TL_account.TL_birthday) obj);
                return;
            default:
                n1 n1Var2 = this.f50149b;
                n1Var2.f50222o0 = (String) obj;
                cy0 cy0Var = n1Var2.f50230w0;
                AndroidUtilities.cancelRunOnUIThread(cy0Var);
                AndroidUtilities.runOnUIThread(cy0Var, 350L);
                return;
        }
    }
}
