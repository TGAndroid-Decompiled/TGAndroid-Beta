package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class xj0 implements Runnable {
    public final int f44600a;
    public final yj0 f44601b;
    public final String f44602c;

    public xj0(yj0 yj0Var, String str, int i10) {
        this.f44600a = i10;
        this.f44601b = yj0Var;
        this.f44602c = str;
    }

    @Override
    public final void run() {
        switch (this.f44600a) {
            case 0:
                yj0 yj0Var = this.f44601b;
                String str = this.f44602c;
                yj0Var.getClass();
                AndroidUtilities.runOnUIThread(new xj0(yj0Var, str, 1));
                return;
            default:
                yj0 yj0Var2 = this.f44601b;
                String str2 = this.f44602c;
                rf.k1 k1Var = yj0Var2.h;
                int i10 = yj0Var2.f44899n.f35617s;
                boolean z10 = true;
                k1Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new xe0(yj0Var2, str2, new ArrayList(yj0Var2.f44899n.f35618w), 8));
                return;
        }
    }
}
