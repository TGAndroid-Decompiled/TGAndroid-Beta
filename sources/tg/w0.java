package tg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f43537a;
    public final z0 f43538b;

    public w0(z0 z0Var, int i10) {
        this.f43537a = i10;
        this.f43538b = z0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43537a) {
            case 0:
                String str = (String) obj;
                z0 z0Var = this.f43538b;
                ArrayList arrayList = z0Var.f43553g0;
                pg.c1 c1Var = z0Var.f43567v0;
                z0Var.f43559n0 = str;
                int i10 = z0Var.f43563r0;
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
                        arrayList.addAll(s.e(z0Var.f43562q0.f18343id));
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
                z0 z0Var2 = this.f43538b;
                ArrayList arrayList2 = z0Var2.f43553g0;
                if (!TextUtils.isEmpty(z0Var2.f43559n0)) {
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
