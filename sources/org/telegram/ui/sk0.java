package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sk0 implements Runnable {
    public final int f40493a;
    public final tk0 f40494b;
    public final String f40495c;

    public sk0(tk0 tk0Var, String str, int i10) {
        this.f40493a = i10;
        this.f40494b = tk0Var;
        this.f40495c = str;
    }

    @Override
    public final void run() {
        switch (this.f40493a) {
            case 0:
                tk0 tk0Var = this.f40494b;
                String str = this.f40495c;
                tk0Var.getClass();
                AndroidUtilities.runOnUIThread(new sk0(tk0Var, str, 1));
                return;
            default:
                tk0 tk0Var2 = this.f40494b;
                String str2 = this.f40495c;
                hg.b2 b2Var = tk0Var2.h;
                int i10 = tk0Var2.f40817n.f33507s;
                boolean z10 = true;
                b2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new pf0(tk0Var2, str2, new ArrayList(tk0Var2.f40817n.f33508w), 8));
                return;
        }
    }
}
