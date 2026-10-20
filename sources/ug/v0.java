package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v0 implements Utilities.Callback {
    public final int f47772a;
    public final y0 f47773b;

    public v0(y0 y0Var, int i10) {
        this.f47772a = i10;
        this.f47773b = y0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47772a) {
            case 0:
                String str = (String) obj;
                y0 y0Var = this.f47773b;
                ArrayList arrayList = y0Var.f47788g0;
                p8.b bVar = y0Var.f47802v0;
                y0Var.f47794n0 = str;
                int i10 = y0Var.f47798r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            y0Var.b0(false, true);
                            y0Var.Y(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        arrayList.clear();
                        arrayList.addAll(r.e(y0Var.f47797q0.f20276id));
                        y0Var.b0(false, true);
                        y0Var.Y(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        AndroidUtilities.runOnUIThread(bVar, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(bVar);
                AndroidUtilities.runOnUIThread(bVar, 350L);
                return;
            default:
                List list = (List) obj;
                y0 y0Var2 = this.f47773b;
                ArrayList arrayList2 = y0Var2.f47788g0;
                if (!TextUtils.isEmpty(y0Var2.f47794n0)) {
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
