package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class rk0 implements Runnable {
    public final int f41672a;
    public final sk0 f41673b;
    public final String f41674c;

    public rk0(sk0 sk0Var, String str, int i10) {
        this.f41672a = i10;
        this.f41673b = sk0Var;
        this.f41674c = str;
    }

    @Override
    public final void run() {
        switch (this.f41672a) {
            case 0:
                sk0 sk0Var = this.f41673b;
                String str = this.f41674c;
                sk0Var.getClass();
                AndroidUtilities.runOnUIThread(new rk0(sk0Var, str, 1));
                return;
            default:
                sk0 sk0Var2 = this.f41673b;
                String str2 = this.f41674c;
                gg.b2 b2Var = sk0Var2.h;
                int i10 = sk0Var2.f41953n.f33673s;
                boolean z10 = true;
                b2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new pf0(sk0Var2, str2, new ArrayList(sk0Var2.f41953n.f33674w), 8));
                return;
        }
    }
}
