package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class a1 implements Utilities.Callback {
    public final int f47688a;
    public final m1 f47689b;

    public a1(m1 m1Var, int i10) {
        this.f47688a = i10;
        this.f47689b = m1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47688a) {
            case 0:
                m1 m1Var = this.f47689b;
                ArrayList arrayList = m1Var.f47766r0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                i1 i1Var = m1Var.Y;
                if (i1Var.N) {
                    i1Var.setLoading(false);
                    if (m1Var.d.G) {
                        m1Var.e0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f47689b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                m1.U(this.f47689b, (TL_account.TL_birthday) obj);
                return;
            default:
                m1 m1Var2 = this.f47689b;
                m1Var2.f47763o0 = (String) obj;
                p4.s0 s0Var = m1Var2.f47771w0;
                AndroidUtilities.cancelRunOnUIThread(s0Var);
                AndroidUtilities.runOnUIThread(s0Var, 350L);
                return;
        }
    }
}
