package tg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class b1 implements Utilities.Callback {
    public final int f46982a;
    public final m1 f46983b;

    public b1(m1 m1Var, int i10) {
        this.f46982a = i10;
        this.f46983b = m1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46982a) {
            case 0:
                m1 m1Var = this.f46983b;
                ArrayList arrayList = m1Var.f47057r0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                j1 j1Var = m1Var.Y;
                if (j1Var.N) {
                    j1Var.setLoading(false);
                    if (m1Var.d.G) {
                        m1Var.d0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f46983b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                m1.R(this.f46983b, (TL_account.TL_birthday) obj);
                return;
            default:
                m1 m1Var2 = this.f46983b;
                m1Var2.f47054o0 = (String) obj;
                pg.c1 c1Var = m1Var2.f47062w0;
                AndroidUtilities.cancelRunOnUIThread(c1Var);
                AndroidUtilities.runOnUIThread(c1Var, 350L);
                return;
        }
    }
}
