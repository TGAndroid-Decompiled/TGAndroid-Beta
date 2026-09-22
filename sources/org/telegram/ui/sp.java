package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sp implements Runnable {
    public final int f37461a;
    public final tp f37462b;
    public final String f37463c;

    public sp(tp tpVar, String str, int i10) {
        this.f37461a = i10;
        this.f37462b = tpVar;
        this.f37463c = str;
    }

    @Override
    public final void run() {
        switch (this.f37461a) {
            case 0:
                tp tpVar = this.f37462b;
                String str = this.f37463c;
                tpVar.getClass();
                AndroidUtilities.runOnUIThread(new sp(tpVar, str, 1));
                return;
            default:
                tp tpVar2 = this.f37462b;
                String str2 = this.f37463c;
                tpVar2.f37863f = null;
                Utilities.searchQueue.postRunnable(new q1(tpVar2, str2, new ArrayList(tpVar2.h.v), 28));
                return;
        }
    }
}
