package tg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Wallet.p5;
public final class v0 implements Utilities.Callback {
    public final int f48521a;
    public final y0 f48522b;

    public v0(y0 y0Var, int i10) {
        this.f48521a = i10;
        this.f48522b = y0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48521a) {
            case 0:
                String str = (String) obj;
                y0 y0Var = this.f48522b;
                ArrayList arrayList = y0Var.f48538g0;
                p5 p5Var = y0Var.f48552v0;
                y0Var.f48544n0 = str;
                int i10 = y0Var.f48548r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            y0Var.b0(false, true);
                            y0Var.Y(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(p5Var);
                        arrayList.clear();
                        arrayList.addAll(r.e(y0Var.f48547q0.f20068id));
                        y0Var.b0(false, true);
                        y0Var.Y(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(p5Var);
                        AndroidUtilities.runOnUIThread(p5Var, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(p5Var);
                AndroidUtilities.runOnUIThread(p5Var, 350L);
                return;
            default:
                List list = (List) obj;
                y0 y0Var2 = this.f48522b;
                ArrayList arrayList2 = y0Var2.f48538g0;
                if (!TextUtils.isEmpty(y0Var2.f48544n0)) {
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
