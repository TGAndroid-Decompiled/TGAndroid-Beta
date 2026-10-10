package tg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Wallet.o5;
public final class w0 implements Utilities.Callback {
    public final int f48467a;
    public final z0 f48468b;

    public w0(z0 z0Var, int i10) {
        this.f48467a = i10;
        this.f48468b = z0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48467a) {
            case 0:
                String str = (String) obj;
                z0 z0Var = this.f48468b;
                ArrayList arrayList = z0Var.f48484g0;
                o5 o5Var = z0Var.f48498v0;
                z0Var.f48490n0 = str;
                int i10 = z0Var.f48494r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            z0Var.b0(false, true);
                            z0Var.Y(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(o5Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(z0Var.f48493q0.f20042id));
                        z0Var.b0(false, true);
                        z0Var.Y(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(o5Var);
                        AndroidUtilities.runOnUIThread(o5Var, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(o5Var);
                AndroidUtilities.runOnUIThread(o5Var, 350L);
                return;
            default:
                List list = (List) obj;
                z0 z0Var2 = this.f48468b;
                ArrayList arrayList2 = z0Var2.f48484g0;
                if (!TextUtils.isEmpty(z0Var2.f48490n0)) {
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
