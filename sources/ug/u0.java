package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u0 implements Utilities.Callback {
    public final int f47784a;
    public final x0 f47785b;

    public u0(x0 x0Var, int i10) {
        this.f47784a = i10;
        this.f47785b = x0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47784a) {
            case 0:
                String str = (String) obj;
                x0 x0Var = this.f47785b;
                ArrayList arrayList = x0Var.f47800g0;
                p4.s0 s0Var = x0Var.f47814v0;
                x0Var.f47806n0 = str;
                int i10 = x0Var.f47810r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            x0Var.b0(false, true);
                            x0Var.Y(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(s0Var);
                        arrayList.clear();
                        arrayList.addAll(q.e(x0Var.f47809q0.f20272id));
                        x0Var.b0(false, true);
                        x0Var.Y(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(s0Var);
                        AndroidUtilities.runOnUIThread(s0Var, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(s0Var);
                AndroidUtilities.runOnUIThread(s0Var, 350L);
                return;
            default:
                List list = (List) obj;
                x0 x0Var2 = this.f47785b;
                ArrayList arrayList2 = x0Var2.f47800g0;
                if (!TextUtils.isEmpty(x0Var2.f47806n0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    x0Var2.c0(true, true);
                    x0Var2.Y(true);
                    return;
                }
                return;
        }
    }
}
