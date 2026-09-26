package tg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f43501a;
    public final z0 f43502b;

    public w0(z0 z0Var, int i10) {
        this.f43501a = i10;
        this.f43502b = z0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43501a) {
            case 0:
                String str = (String) obj;
                z0 z0Var = this.f43502b;
                ArrayList arrayList = z0Var.f43517g0;
                pg.c1 c1Var = z0Var.f43531v0;
                z0Var.f43523n0 = str;
                int i10 = z0Var.f43527r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            z0Var.a0(false, true);
                            z0Var.X(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(c1Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(z0Var.f43526q0.f18335id));
                        z0Var.a0(false, true);
                        z0Var.X(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(c1Var);
                        AndroidUtilities.runOnUIThread(c1Var, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(c1Var);
                AndroidUtilities.runOnUIThread(c1Var, 350L);
                return;
            default:
                List list = (List) obj;
                z0 z0Var2 = this.f43502b;
                ArrayList arrayList2 = z0Var2.f43517g0;
                if (!TextUtils.isEmpty(z0Var2.f43523n0)) {
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
