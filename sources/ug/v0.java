package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v0 implements Utilities.Callback {
    public final int f47776a;
    public final y0 f47777b;

    public v0(y0 y0Var, int i10) {
        this.f47776a = i10;
        this.f47777b = y0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47776a) {
            case 0:
                String str = (String) obj;
                y0 y0Var = this.f47777b;
                ArrayList arrayList = y0Var.f47792g0;
                p8.b bVar = y0Var.f47806v0;
                y0Var.f47798n0 = str;
                int i10 = y0Var.f47802r0;
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
                        arrayList.addAll(r.e(y0Var.f47801q0.f20280id));
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
                y0 y0Var2 = this.f47777b;
                ArrayList arrayList2 = y0Var2.f47792g0;
                if (!TextUtils.isEmpty(y0Var2.f47798n0)) {
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
