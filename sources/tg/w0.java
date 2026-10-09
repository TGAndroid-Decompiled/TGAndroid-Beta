package tg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Wallet.n5;
public final class w0 implements Utilities.Callback {
    public final int f48423a;
    public final z0 f48424b;

    public w0(z0 z0Var, int i10) {
        this.f48423a = i10;
        this.f48424b = z0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48423a) {
            case 0:
                String str = (String) obj;
                z0 z0Var = this.f48424b;
                ArrayList arrayList = z0Var.f48440g0;
                n5 n5Var = z0Var.f48454v0;
                z0Var.f48446n0 = str;
                int i10 = z0Var.f48450r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            z0Var.b0(false, true);
                            z0Var.Y(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(n5Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(z0Var.f48449q0.f20038id));
                        z0Var.b0(false, true);
                        z0Var.Y(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(n5Var);
                        AndroidUtilities.runOnUIThread(n5Var, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(n5Var);
                AndroidUtilities.runOnUIThread(n5Var, 350L);
                return;
            default:
                List list = (List) obj;
                z0 z0Var2 = this.f48424b;
                ArrayList arrayList2 = z0Var2.f48440g0;
                if (!TextUtils.isEmpty(z0Var2.f48446n0)) {
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
