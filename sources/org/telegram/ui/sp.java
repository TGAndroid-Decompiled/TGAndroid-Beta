package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sp implements Runnable {
    public final int f41771a;
    public final tp f41772b;
    public final String f41773c;

    public sp(tp tpVar, String str, int i10) {
        this.f41771a = i10;
        this.f41772b = tpVar;
        this.f41773c = str;
    }

    @Override
    public final void run() {
        switch (this.f41771a) {
            case 0:
                tp tpVar = this.f41772b;
                String str = this.f41773c;
                tpVar.getClass();
                AndroidUtilities.runOnUIThread(new sp(tpVar, str, 1));
                return;
            default:
                tp tpVar2 = this.f41772b;
                String str2 = this.f41773c;
                tpVar2.f42219f = null;
                Utilities.searchQueue.postRunnable(new q1(tpVar2, str2, new ArrayList(tpVar2.h.v), 28));
                return;
        }
    }
}
