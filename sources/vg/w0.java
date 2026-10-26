package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cy0;
public final class w0 implements Utilities.Callback {
    public final int f50271a;
    public final z0 f50272b;

    public w0(z0 z0Var, int i10) {
        this.f50271a = i10;
        this.f50272b = z0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50271a) {
            case 0:
                String str = (String) obj;
                z0 z0Var = this.f50272b;
                ArrayList arrayList = z0Var.f50287g0;
                cy0 cy0Var = z0Var.f50301v0;
                z0Var.f50293n0 = str;
                int i10 = z0Var.f50297r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            z0Var.a0(false, true);
                            z0Var.X(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(cy0Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(z0Var.f50296q0.f22027id));
                        z0Var.a0(false, true);
                        z0Var.X(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(cy0Var);
                        AndroidUtilities.runOnUIThread(cy0Var, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(cy0Var);
                AndroidUtilities.runOnUIThread(cy0Var, 350L);
                return;
            default:
                List list = (List) obj;
                z0 z0Var2 = this.f50272b;
                ArrayList arrayList2 = z0Var2.f50287g0;
                if (!TextUtils.isEmpty(z0Var2.f50293n0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    z0Var2.b0(true, true);
                    z0Var2.X(true);
                    return;
                }
                return;
        }
    }
}
