package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class zj0 implements Runnable {
    public final int f43761a;
    public final ak0 f43762b;
    public final String f43763c;

    public zj0(ak0 ak0Var, String str, int i10) {
        this.f43761a = i10;
        this.f43762b = ak0Var;
        this.f43763c = str;
    }

    @Override
    public final void run() {
        switch (this.f43761a) {
            case 0:
                ak0 ak0Var = this.f43762b;
                String str = this.f43763c;
                ak0Var.getClass();
                AndroidUtilities.runOnUIThread(new zj0(ak0Var, str, 1));
                return;
            default:
                ak0 ak0Var2 = this.f43762b;
                String str2 = this.f43763c;
                hg.a2 a2Var = ak0Var2.h;
                int i10 = ak0Var2.f35377n.f33205s;
                boolean z10 = true;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new ve0(ak0Var2, str2, new ArrayList(ak0Var2.f35377n.f33206w), 9));
                return;
        }
    }
}
