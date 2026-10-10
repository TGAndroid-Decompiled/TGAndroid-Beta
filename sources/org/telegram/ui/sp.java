package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sp implements Runnable {
    public final int f41785a;
    public final tp f41786b;
    public final String f41787c;

    public sp(tp tpVar, String str, int i10) {
        this.f41785a = i10;
        this.f41786b = tpVar;
        this.f41787c = str;
    }

    @Override
    public final void run() {
        switch (this.f41785a) {
            case 0:
                tp tpVar = this.f41786b;
                String str = this.f41787c;
                tpVar.getClass();
                AndroidUtilities.runOnUIThread(new sp(tpVar, str, 1));
                return;
            default:
                tp tpVar2 = this.f41786b;
                String str2 = this.f41787c;
                tpVar2.f42083f = null;
                Utilities.searchQueue.postRunnable(new r1(tpVar2, str2, new ArrayList(tpVar2.h.v), 28));
                return;
        }
    }
}
