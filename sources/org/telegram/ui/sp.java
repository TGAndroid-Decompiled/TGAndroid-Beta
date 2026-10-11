package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sp implements Runnable {
    public final int f41805a;
    public final tp f41806b;
    public final String f41807c;

    public sp(tp tpVar, String str, int i10) {
        this.f41805a = i10;
        this.f41806b = tpVar;
        this.f41807c = str;
    }

    @Override
    public final void run() {
        switch (this.f41805a) {
            case 0:
                tp tpVar = this.f41806b;
                String str = this.f41807c;
                tpVar.getClass();
                AndroidUtilities.runOnUIThread(new sp(tpVar, str, 1));
                return;
            default:
                tp tpVar2 = this.f41806b;
                String str2 = this.f41807c;
                tpVar2.f42253f = null;
                Utilities.searchQueue.postRunnable(new q1(tpVar2, str2, new ArrayList(tpVar2.h.v), 28));
                return;
        }
    }
}
