package ug;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class a1 implements Utilities.Callback {
    public final int f47648a;
    public final m1 f47649b;

    public a1(m1 m1Var, int i10) {
        this.f47648a = i10;
        this.f47649b = m1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47648a) {
            case 0:
                m1 m1Var = this.f47649b;
                ArrayList arrayList = m1Var.f47726r0;
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
                this.f47649b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                m1.U(this.f47649b, (TL_account.TL_birthday) obj);
                return;
            default:
                m1 m1Var2 = this.f47649b;
                m1Var2.f47723o0 = (String) obj;
                p8.b bVar = m1Var2.f47731w0;
                AndroidUtilities.cancelRunOnUIThread(bVar);
                AndroidUtilities.runOnUIThread(bVar, 350L);
                return;
        }
    }
}
