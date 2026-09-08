package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class c1 implements Utilities.Callback {
    public final int f47127a;
    public final n1 f47128b;

    public c1(n1 n1Var, int i10) {
        this.f47127a = i10;
        this.f47128b = n1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47127a) {
            case 0:
                n1 n1Var = this.f47128b;
                ArrayList arrayList = n1Var.f47201r0;
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
                this.f47128b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                n1.T(this.f47128b, (TL_account.TL_birthday) obj);
                return;
            default:
                n1 n1Var2 = this.f47128b;
                n1Var2.f47198o0 = (String) obj;
                rg.b0 b0Var = n1Var2.f47206w0;
                AndroidUtilities.cancelRunOnUIThread(b0Var);
                AndroidUtilities.runOnUIThread(b0Var, 350L);
                return;
        }
    }
}
