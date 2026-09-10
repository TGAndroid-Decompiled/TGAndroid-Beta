package sg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class e1 implements Utilities.Callback {
    public final int f41915a;
    public final p1 f41916b;

    public e1(p1 p1Var, int i10) {
        this.f41915a = i10;
        this.f41916b = p1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41915a) {
            case 0:
                p1 p1Var = this.f41916b;
                ArrayList arrayList = p1Var.f41983r0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                m1 m1Var = p1Var.Y;
                if (m1Var.N) {
                    m1Var.setLoading(false);
                    if (p1Var.d.G) {
                        p1Var.d0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f41916b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                p1.T(this.f41916b, (TL_account.TL_birthday) obj);
                return;
            default:
                p1 p1Var2 = this.f41916b;
                p1Var2.f41980o0 = (String) obj;
                a1 a1Var = p1Var2.f41988w0;
                AndroidUtilities.cancelRunOnUIThread(a1Var);
                AndroidUtilities.runOnUIThread(a1Var, 350L);
                return;
        }
    }
}
