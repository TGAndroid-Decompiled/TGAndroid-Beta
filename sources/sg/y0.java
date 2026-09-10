package sg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class y0 implements Utilities.Callback {
    public final int f42028a;
    public final c1 f42029b;

    public y0(c1 c1Var, int i10) {
        this.f42028a = i10;
        this.f42029b = c1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42028a) {
            case 0:
                String str = (String) obj;
                c1 c1Var = this.f42029b;
                ArrayList arrayList = c1Var.f41885g0;
                a1 a1Var = c1Var.f41899v0;
                c1Var.f41891n0 = str;
                int i10 = c1Var.f41895r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            c1Var.a0(false, true);
                            c1Var.X(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(a1Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(c1Var.f41894q0.f17195id));
                        c1Var.a0(false, true);
                        c1Var.X(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(a1Var);
                        AndroidUtilities.runOnUIThread(a1Var, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(a1Var);
                AndroidUtilities.runOnUIThread(a1Var, 350L);
                return;
            default:
                List list = (List) obj;
                c1 c1Var2 = this.f42029b;
                ArrayList arrayList2 = c1Var2.f41885g0;
                if (!TextUtils.isEmpty(c1Var2.f41891n0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    c1Var2.b0(true, true);
                    c1Var2.X(true);
                    return;
                }
                return;
        }
    }
}
