package ug;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f46403a;
    public final z0 f46404b;

    public w0(z0 z0Var, int i10) {
        this.f46403a = i10;
        this.f46404b = z0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46403a) {
            case 0:
                String str = (String) obj;
                z0 z0Var = this.f46404b;
                ArrayList arrayList = z0Var.f46419g0;
                p4.s0 s0Var = z0Var.f46433v0;
                z0Var.f46425n0 = str;
                int i10 = z0Var.f46429r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            z0Var.b0(false, true);
                            z0Var.Y(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(s0Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(z0Var.f46428q0.f18916id));
                        z0Var.b0(false, true);
                        z0Var.Y(true);
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
                z0 z0Var2 = this.f46404b;
                ArrayList arrayList2 = z0Var2.f46419g0;
                if (!TextUtils.isEmpty(z0Var2.f46425n0)) {
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
