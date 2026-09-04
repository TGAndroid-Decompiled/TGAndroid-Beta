package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class c1 implements Utilities.Callback {
    public final int f47099a;
    public final n1 f47100b;

    public c1(n1 n1Var, int i10) {
        this.f47099a = i10;
        this.f47100b = n1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47099a) {
            case 0:
                n1 n1Var = this.f47100b;
                ArrayList arrayList = n1Var.f47173r0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                k1 k1Var = n1Var.Y;
                if (k1Var.N) {
                    k1Var.setLoading(false);
                    if (n1Var.d.G) {
                        n1Var.d0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f47100b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                n1.T(this.f47100b, (TL_account.TL_birthday) obj);
                return;
            default:
                n1 n1Var2 = this.f47100b;
                n1Var2.f47170o0 = (String) obj;
                rg.b0 b0Var = n1Var2.f47178w0;
                AndroidUtilities.cancelRunOnUIThread(b0Var);
                AndroidUtilities.runOnUIThread(b0Var, 350L);
                return;
        }
    }
}
