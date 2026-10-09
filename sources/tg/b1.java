package tg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Wallet.n5;
public final class b1 implements Utilities.Callback {
    public final int f48297a;
    public final m1 f48298b;

    public b1(m1 m1Var, int i10) {
        this.f48297a = i10;
        this.f48298b = m1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48297a) {
            case 0:
                m1 m1Var = this.f48298b;
                ArrayList arrayList = m1Var.f48371r0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                j1 j1Var = m1Var.Y;
                if (j1Var.N) {
                    j1Var.setLoading(false);
                    if (m1Var.d.G) {
                        m1Var.e0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f48298b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                m1.U(this.f48298b, (TL_account.TL_birthday) obj);
                return;
            default:
                m1 m1Var2 = this.f48298b;
                m1Var2.f48368o0 = (String) obj;
                n5 n5Var = m1Var2.f48376w0;
                AndroidUtilities.cancelRunOnUIThread(n5Var);
                AndroidUtilities.runOnUIThread(n5Var, 350L);
                return;
        }
    }
}
