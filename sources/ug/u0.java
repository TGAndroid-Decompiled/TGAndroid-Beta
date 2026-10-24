package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Wallet.m4;
public final class u0 implements Utilities.Callback {
    public final int f48208a;
    public final x0 f48209b;

    public u0(x0 x0Var, int i10) {
        this.f48208a = i10;
        this.f48209b = x0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48208a) {
            case 0:
                String str = (String) obj;
                x0 x0Var = this.f48209b;
                ArrayList arrayList = x0Var.f48224g0;
                m4 m4Var = x0Var.f48238v0;
                x0Var.f48230n0 = str;
                int i10 = x0Var.f48234r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            x0Var.a0(false, true);
                            x0Var.X(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(m4Var);
                        arrayList.clear();
                        arrayList.addAll(q.e(x0Var.f48233q0.f20344id));
                        x0Var.a0(false, true);
                        x0Var.X(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(m4Var);
                        AndroidUtilities.runOnUIThread(m4Var, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(m4Var);
                AndroidUtilities.runOnUIThread(m4Var, 350L);
                return;
            default:
                List list = (List) obj;
                x0 x0Var2 = this.f48209b;
                ArrayList arrayList2 = x0Var2.f48224g0;
                if (!TextUtils.isEmpty(x0Var2.f48230n0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    x0Var2.b0(true, true);
                    x0Var2.X(true);
                    return;
                }
                return;
        }
    }
}
