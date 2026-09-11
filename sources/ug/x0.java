package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f47225a;
    public final a1 f47226b;

    public x0(a1 a1Var, int i10) {
        this.f47225a = i10;
        this.f47226b = a1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47225a) {
            case 0:
                String str = (String) obj;
                a1 a1Var = this.f47226b;
                ArrayList arrayList = a1Var.f47049g0;
                rg.b0 b0Var = a1Var.f47063v0;
                a1Var.f47055n0 = str;
                int i10 = a1Var.f47059r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            a1Var.a0(false, true);
                            a1Var.X(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(b0Var);
                        arrayList.clear();
                        arrayList.addAll(t.e(a1Var.f47058q0.f19869id));
                        a1Var.a0(false, true);
                        a1Var.X(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(b0Var);
                        AndroidUtilities.runOnUIThread(b0Var, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(b0Var);
                AndroidUtilities.runOnUIThread(b0Var, 350L);
                return;
            default:
                List list = (List) obj;
                a1 a1Var2 = this.f47226b;
                ArrayList arrayList2 = a1Var2.f47049g0;
                if (!TextUtils.isEmpty(a1Var2.f47055n0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    a1Var2.b0(true, true);
                    a1Var2.X(true);
                    return;
                }
                return;
        }
    }
}
