package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sk0 implements Runnable {
    public final int f40466a;
    public final tk0 f40467b;
    public final String f40468c;

    public sk0(tk0 tk0Var, String str, int i10) {
        this.f40466a = i10;
        this.f40467b = tk0Var;
        this.f40468c = str;
    }

    @Override
    public final void run() {
        switch (this.f40466a) {
            case 0:
                tk0 tk0Var = this.f40467b;
                String str = this.f40468c;
                tk0Var.getClass();
                AndroidUtilities.runOnUIThread(new sk0(tk0Var, str, 1));
                return;
            default:
                tk0 tk0Var2 = this.f40467b;
                String str2 = this.f40468c;
                hg.b2 b2Var = tk0Var2.h;
                int i10 = tk0Var2.f40790n.f33480s;
                boolean z10 = true;
                b2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new pf0(tk0Var2, str2, new ArrayList(tk0Var2.f40790n.f33481w), 8));
                return;
        }
    }
}
