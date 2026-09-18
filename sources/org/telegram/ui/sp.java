package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sp implements Runnable {
    public final int f37382a;
    public final tp f37383b;
    public final String f37384c;

    public sp(tp tpVar, String str, int i10) {
        this.f37382a = i10;
        this.f37383b = tpVar;
        this.f37384c = str;
    }

    @Override
    public final void run() {
        switch (this.f37382a) {
            case 0:
                tp tpVar = this.f37383b;
                String str = this.f37384c;
                tpVar.getClass();
                AndroidUtilities.runOnUIThread(new sp(tpVar, str, 1));
                return;
            default:
                tp tpVar2 = this.f37383b;
                String str2 = this.f37384c;
                tpVar2.f37788f = null;
                Utilities.searchQueue.postRunnable(new q1(tpVar2, str2, new ArrayList(tpVar2.h.v), 28));
                return;
        }
    }
}
