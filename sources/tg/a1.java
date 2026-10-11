package tg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Wallet.p5;
public final class a1 implements Utilities.Callback {
    public final int f48357a;
    public final m1 f48358b;

    public a1(m1 m1Var, int i10) {
        this.f48357a = i10;
        this.f48358b = m1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48357a) {
            case 0:
                m1 m1Var = this.f48358b;
                ArrayList arrayList = m1Var.f48438r0;
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
                this.f48358b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                m1.U(this.f48358b, (TL_account.TL_birthday) obj);
                return;
            default:
                m1 m1Var2 = this.f48358b;
                m1Var2.f48435o0 = (String) obj;
                p5 p5Var = m1Var2.f48443w0;
                AndroidUtilities.cancelRunOnUIThread(p5Var);
                AndroidUtilities.runOnUIThread(p5Var, 350L);
                return;
        }
    }
}
