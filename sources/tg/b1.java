package tg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class b1 implements Utilities.Callback {
    public final int f48536a;
    public final m1 f48537b;

    public b1(m1 m1Var, int i10) {
        this.f48536a = i10;
        this.f48537b = m1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48536a) {
            case 0:
                m1 m1Var = this.f48537b;
                ArrayList arrayList = m1Var.f48610r0;
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
                this.f48537b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                m1.U(this.f48537b, (TL_account.TL_birthday) obj);
                return;
            default:
                m1 m1Var2 = this.f48537b;
                m1Var2.f48607o0 = (String) obj;
                p4.t0 t0Var = m1Var2.f48615w0;
                AndroidUtilities.cancelRunOnUIThread(t0Var);
                AndroidUtilities.runOnUIThread(t0Var, 350L);
                return;
        }
    }
}
