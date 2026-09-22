package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sk0 implements Runnable {
    public final int f37443a;
    public final tk0 f37444b;
    public final String f37445c;

    public sk0(tk0 tk0Var, String str, int i10) {
        this.f37443a = i10;
        this.f37444b = tk0Var;
        this.f37445c = str;
    }

    @Override
    public final void run() {
        switch (this.f37443a) {
            case 0:
                tk0 tk0Var = this.f37444b;
                String str = this.f37445c;
                tk0Var.getClass();
                AndroidUtilities.runOnUIThread(new sk0(tk0Var, str, 1));
                return;
            default:
                tk0 tk0Var2 = this.f37444b;
                String str2 = this.f37445c;
                gg.c2 c2Var = tk0Var2.h;
                int i10 = tk0Var2.f37843n.f31175s;
                boolean z10 = true;
                c2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new rf0(tk0Var2, str2, new ArrayList(tk0Var2.f37843n.f31176w), 8));
                return;
        }
    }
}
