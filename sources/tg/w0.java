package tg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f47108a;
    public final z0 f47109b;

    public w0(z0 z0Var, int i10) {
        this.f47108a = i10;
        this.f47109b = z0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47108a) {
            case 0:
                String str = (String) obj;
                z0 z0Var = this.f47109b;
                ArrayList arrayList = z0Var.f47125g0;
                pg.c1 c1Var = z0Var.f47139v0;
                z0Var.f47131n0 = str;
                int i10 = z0Var.f47135r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            z0Var.Z(false, true);
                            z0Var.W(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(c1Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(z0Var.f47134q0.f20037id));
                        z0Var.Z(false, true);
                        z0Var.W(true);
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
                z0 z0Var2 = this.f47109b;
                ArrayList arrayList2 = z0Var2.f47125g0;
                if (!TextUtils.isEmpty(z0Var2.f47131n0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    z0Var2.b0(true, true);
                    z0Var2.W(true);
                    return;
                }
                return;
        }
    }
}
