package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class zj0 implements Runnable {
    public final int f43767a;
    public final ak0 f43768b;
    public final String f43769c;

    public zj0(ak0 ak0Var, String str, int i10) {
        this.f43767a = i10;
        this.f43768b = ak0Var;
        this.f43769c = str;
    }

    @Override
    public final void run() {
        switch (this.f43767a) {
            case 0:
                ak0 ak0Var = this.f43768b;
                String str = this.f43769c;
                ak0Var.getClass();
                AndroidUtilities.runOnUIThread(new zj0(ak0Var, str, 1));
                return;
            default:
                ak0 ak0Var2 = this.f43768b;
                String str2 = this.f43769c;
                hg.a2 a2Var = ak0Var2.h;
                int i10 = ak0Var2.f35384n.f33212s;
                boolean z10 = true;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new ve0(ak0Var2, str2, new ArrayList(ak0Var2.f35384n.f33213w), 9));
                return;
        }
    }
}
