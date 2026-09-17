package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sk0 implements Runnable {
    public final int f40494a;
    public final tk0 f40495b;
    public final String f40496c;

    public sk0(tk0 tk0Var, String str, int i10) {
        this.f40494a = i10;
        this.f40495b = tk0Var;
        this.f40496c = str;
    }

    @Override
    public final void run() {
        switch (this.f40494a) {
            case 0:
                tk0 tk0Var = this.f40495b;
                String str = this.f40496c;
                tk0Var.getClass();
                AndroidUtilities.runOnUIThread(new sk0(tk0Var, str, 1));
                return;
            default:
                tk0 tk0Var2 = this.f40495b;
                String str2 = this.f40496c;
                hg.b2 b2Var = tk0Var2.h;
                int i10 = tk0Var2.f40818n.f33508s;
                boolean z10 = true;
                b2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new pf0(tk0Var2, str2, new ArrayList(tk0Var2.f40818n.f33509w), 8));
                return;
        }
    }
}
