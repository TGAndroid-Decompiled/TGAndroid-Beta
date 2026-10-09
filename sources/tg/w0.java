package tg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Wallet.m5;
public final class w0 implements Utilities.Callback {
    public final int f48421a;
    public final z0 f48422b;

    public w0(z0 z0Var, int i10) {
        this.f48421a = i10;
        this.f48422b = z0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48421a) {
            case 0:
                String str = (String) obj;
                z0 z0Var = this.f48422b;
                ArrayList arrayList = z0Var.f48438g0;
                m5 m5Var = z0Var.f48452v0;
                z0Var.f48444n0 = str;
                int i10 = z0Var.f48448r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            z0Var.b0(false, true);
                            z0Var.Y(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(m5Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(z0Var.f48447q0.f20038id));
                        z0Var.b0(false, true);
                        z0Var.Y(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(m5Var);
                        AndroidUtilities.runOnUIThread(m5Var, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(m5Var);
                AndroidUtilities.runOnUIThread(m5Var, 350L);
                return;
            default:
                List list = (List) obj;
                z0 z0Var2 = this.f48422b;
                ArrayList arrayList2 = z0Var2.f48438g0;
                if (!TextUtils.isEmpty(z0Var2.f48444n0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    z0Var2.c0(true, true);
                    z0Var2.Y(true);
                    return;
                }
                return;
        }
    }
}
