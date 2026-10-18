package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v0 implements Utilities.Callback {
    public final int f47812a;
    public final y0 f47813b;

    public v0(y0 y0Var, int i10) {
        this.f47812a = i10;
        this.f47813b = y0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47812a) {
            case 0:
                String str = (String) obj;
                y0 y0Var = this.f47813b;
                ArrayList arrayList = y0Var.f47828g0;
                p4.s0 s0Var = y0Var.f47842v0;
                y0Var.f47834n0 = str;
                int i10 = y0Var.f47838r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            y0Var.b0(false, true);
                            y0Var.Y(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(s0Var);
                        arrayList.clear();
                        arrayList.addAll(r.e(y0Var.f47837q0.f20279id));
                        y0Var.b0(false, true);
                        y0Var.Y(true);
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
                y0 y0Var2 = this.f47813b;
                ArrayList arrayList2 = y0Var2.f47828g0;
                if (!TextUtils.isEmpty(y0Var2.f47834n0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    y0Var2.c0(true, true);
                    y0Var2.Y(true);
                    return;
                }
                return;
        }
    }
}
