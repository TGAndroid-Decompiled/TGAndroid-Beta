package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sk0 implements Runnable {
    public final int f40467a;
    public final tk0 f40468b;
    public final String f40469c;

    public sk0(tk0 tk0Var, String str, int i10) {
        this.f40467a = i10;
        this.f40468b = tk0Var;
        this.f40469c = str;
    }

    @Override
    public final void run() {
        switch (this.f40467a) {
            case 0:
                tk0 tk0Var = this.f40468b;
                String str = this.f40469c;
                tk0Var.getClass();
                AndroidUtilities.runOnUIThread(new sk0(tk0Var, str, 1));
                return;
            default:
                tk0 tk0Var2 = this.f40468b;
                String str2 = this.f40469c;
                hg.b2 b2Var = tk0Var2.h;
                int i10 = tk0Var2.f40791n.f33481s;
                boolean z10 = true;
                b2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new pf0(tk0Var2, str2, new ArrayList(tk0Var2.f40791n.f33482w), 8));
                return;
        }
    }
}
