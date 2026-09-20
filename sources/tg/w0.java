package tg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f43516a;
    public final z0 f43517b;

    public w0(z0 z0Var, int i10) {
        this.f43516a = i10;
        this.f43517b = z0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43516a) {
            case 0:
                String str = (String) obj;
                z0 z0Var = this.f43517b;
                ArrayList arrayList = z0Var.f43532g0;
                p8.b bVar = z0Var.f43546v0;
                z0Var.f43538n0 = str;
                int i10 = z0Var.f43542r0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            z0Var.a0(false, true);
                            z0Var.X(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        arrayList.clear();
                        arrayList.addAll(s.e(z0Var.f43541q0.f18328id));
                        z0Var.a0(false, true);
                        z0Var.X(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        AndroidUtilities.runOnUIThread(bVar, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(bVar);
                AndroidUtilities.runOnUIThread(bVar, 350L);
                return;
            default:
                List list = (List) obj;
                z0 z0Var2 = this.f43517b;
                ArrayList arrayList2 = z0Var2.f43532g0;
                if (!TextUtils.isEmpty(z0Var2.f43538n0)) {
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
