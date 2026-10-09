package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sp implements Runnable {
    public final int f41741a;
    public final tp f41742b;
    public final String f41743c;

    public sp(tp tpVar, String str, int i10) {
        this.f41741a = i10;
        this.f41742b = tpVar;
        this.f41743c = str;
    }

    @Override
    public final void run() {
        switch (this.f41741a) {
            case 0:
                tp tpVar = this.f41742b;
                String str = this.f41743c;
                tpVar.getClass();
                AndroidUtilities.runOnUIThread(new sp(tpVar, str, 1));
                return;
            default:
                tp tpVar2 = this.f41742b;
                String str2 = this.f41743c;
                tpVar2.f42039f = null;
                Utilities.searchQueue.postRunnable(new r1(tpVar2, str2, new ArrayList(tpVar2.h.v), 28));
                return;
        }
    }
}
