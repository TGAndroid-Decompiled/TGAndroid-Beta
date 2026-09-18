package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class rk0 implements Runnable {
    public final int f37258a;
    public final sk0 f37259b;
    public final String f37260c;

    public rk0(sk0 sk0Var, String str, int i10) {
        this.f37258a = i10;
        this.f37259b = sk0Var;
        this.f37260c = str;
    }

    @Override
    public final void run() {
        switch (this.f37258a) {
            case 0:
                sk0 sk0Var = this.f37259b;
                String str = this.f37260c;
                sk0Var.getClass();
                AndroidUtilities.runOnUIThread(new rk0(sk0Var, str, 1));
                return;
            default:
                sk0 sk0Var2 = this.f37259b;
                String str2 = this.f37260c;
                gg.c2 c2Var = sk0Var2.h;
                int i10 = sk0Var2.f37515n.f30887s;
                boolean z10 = true;
                c2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new rf0(sk0Var2, str2, new ArrayList(sk0Var2.f37515n.f30888w), 8));
                return;
        }
    }
}
