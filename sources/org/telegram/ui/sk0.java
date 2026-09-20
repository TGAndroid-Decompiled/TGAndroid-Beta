package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sk0 implements Runnable {
    public final int f37419a;
    public final tk0 f37420b;
    public final String f37421c;

    public sk0(tk0 tk0Var, String str, int i10) {
        this.f37419a = i10;
        this.f37420b = tk0Var;
        this.f37421c = str;
    }

    @Override
    public final void run() {
        switch (this.f37419a) {
            case 0:
                tk0 tk0Var = this.f37420b;
                String str = this.f37421c;
                tk0Var.getClass();
                AndroidUtilities.runOnUIThread(new sk0(tk0Var, str, 1));
                return;
            default:
                tk0 tk0Var2 = this.f37420b;
                String str2 = this.f37421c;
                gg.c2 c2Var = tk0Var2.h;
                int i10 = tk0Var2.f37842n.f31154s;
                boolean z10 = true;
                c2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new rf0(tk0Var2, str2, new ArrayList(tk0Var2.f37842n.f31155w), 8));
                return;
        }
    }
}
