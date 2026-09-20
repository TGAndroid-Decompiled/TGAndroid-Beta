package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sp implements Runnable {
    public final int f37437a;
    public final tp f37438b;
    public final String f37439c;

    public sp(tp tpVar, String str, int i10) {
        this.f37437a = i10;
        this.f37438b = tpVar;
        this.f37439c = str;
    }

    @Override
    public final void run() {
        switch (this.f37437a) {
            case 0:
                tp tpVar = this.f37438b;
                String str = this.f37439c;
                tpVar.getClass();
                AndroidUtilities.runOnUIThread(new sp(tpVar, str, 1));
                return;
            default:
                tp tpVar2 = this.f37438b;
                String str2 = this.f37439c;
                tpVar2.f37862f = null;
                Utilities.searchQueue.postRunnable(new q1(tpVar2, str2, new ArrayList(tpVar2.h.v), 28));
                return;
        }
    }
}
