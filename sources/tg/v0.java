package tg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v0 implements Utilities.Callback {
    public final int f48628a;
    public final y0 f48629b;

    public v0(y0 y0Var, int i10) {
        this.f48628a = i10;
        this.f48629b = y0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48628a) {
            case 0:
                String str = (String) obj;
                y0 y0Var = this.f48629b;
                ArrayList arrayList = y0Var.f48645g0;
                p4.t0 t0Var = y0Var.f48659v0;
                y0Var.f48651n0 = str;
                int i10 = y0Var.f48655r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            y0Var.b0(false, true);
                            y0Var.Y(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(t0Var);
                        arrayList.clear();
                        arrayList.addAll(r.e(y0Var.f48654q0.f19802id));
                        y0Var.b0(false, true);
                        y0Var.Y(true);
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
                y0 y0Var2 = this.f48629b;
                ArrayList arrayList2 = y0Var2.f48645g0;
                if (!TextUtils.isEmpty(y0Var2.f48651n0)) {
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
