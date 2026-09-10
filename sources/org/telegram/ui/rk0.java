package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class rk0 implements Runnable {
    public final int f36382a;
    public final sk0 f36383b;
    public final String f36384c;

    public rk0(sk0 sk0Var, String str, int i10) {
        this.f36382a = i10;
        this.f36383b = sk0Var;
        this.f36384c = str;
    }

    @Override
    public final void run() {
        switch (this.f36382a) {
            case 0:
                sk0 sk0Var = this.f36383b;
                String str = this.f36384c;
                sk0Var.getClass();
                AndroidUtilities.runOnUIThread(new rk0(sk0Var, str, 1));
                return;
            default:
                sk0 sk0Var2 = this.f36383b;
                String str2 = this.f36384c;
                fg.d2 d2Var = sk0Var2.h;
                int i10 = sk0Var2.f36718n.f29983s;
                boolean z10 = true;
                d2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new pf0(sk0Var2, str2, new ArrayList(sk0Var2.f36718n.f29984w), 8));
                return;
        }
    }
}
