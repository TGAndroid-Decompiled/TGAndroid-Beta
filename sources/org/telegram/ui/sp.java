package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sp implements Runnable {
    public final int f41739a;
    public final tp f41740b;
    public final String f41741c;

    public sp(tp tpVar, String str, int i10) {
        this.f41739a = i10;
        this.f41740b = tpVar;
        this.f41741c = str;
    }

    @Override
    public final void run() {
        switch (this.f41739a) {
            case 0:
                tp tpVar = this.f41740b;
                String str = this.f41741c;
                tpVar.getClass();
                AndroidUtilities.runOnUIThread(new sp(tpVar, str, 1));
                return;
            default:
                tp tpVar2 = this.f41740b;
                String str2 = this.f41741c;
                tpVar2.f42037f = null;
                Utilities.searchQueue.postRunnable(new r1(tpVar2, str2, new ArrayList(tpVar2.h.v), 28));
                return;
        }
    }
}
