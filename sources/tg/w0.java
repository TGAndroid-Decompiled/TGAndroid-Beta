package tg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f48661a;
    public final z0 f48662b;

    public w0(z0 z0Var, int i10) {
        this.f48661a = i10;
        this.f48662b = z0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48661a) {
            case 0:
                String str = (String) obj;
                z0 z0Var = this.f48662b;
                ArrayList arrayList = z0Var.f48679g0;
                p4.t0 t0Var = z0Var.f48693v0;
                z0Var.f48685n0 = str;
                int i10 = z0Var.f48689r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            z0Var.b0(false, true);
                            z0Var.Y(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(t0Var);
                        arrayList.clear();
                        arrayList.addAll(r.e(z0Var.f48688q0.f19803id));
                        z0Var.b0(false, true);
                        z0Var.Y(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(t0Var);
                        AndroidUtilities.runOnUIThread(t0Var, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(t0Var);
                AndroidUtilities.runOnUIThread(t0Var, 350L);
                return;
            default:
                List list = (List) obj;
                z0 z0Var2 = this.f48662b;
                ArrayList arrayList2 = z0Var2.f48679g0;
                if (!TextUtils.isEmpty(z0Var2.f48685n0)) {
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
