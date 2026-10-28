package vg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dy0;
public final class w0 implements Utilities.Callback {
    public final int f50306a;
    public final z0 f50307b;

    public w0(z0 z0Var, int i10) {
        this.f50306a = i10;
        this.f50307b = z0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50306a) {
            case 0:
                String str = (String) obj;
                z0 z0Var = this.f50307b;
                ArrayList arrayList = z0Var.f50322g0;
                dy0 dy0Var = z0Var.f50336v0;
                z0Var.f50328n0 = str;
                int i10 = z0Var.f50332r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            z0Var.a0(false, true);
                            z0Var.X(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(dy0Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(z0Var.f50331q0.f22028id));
                        z0Var.a0(false, true);
                        z0Var.X(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(dy0Var);
                        AndroidUtilities.runOnUIThread(dy0Var, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(dy0Var);
                AndroidUtilities.runOnUIThread(dy0Var, 350L);
                return;
            default:
                List list = (List) obj;
                z0 z0Var2 = this.f50307b;
                ArrayList arrayList2 = z0Var2.f50322g0;
                if (!TextUtils.isEmpty(z0Var2.f50328n0)) {
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
