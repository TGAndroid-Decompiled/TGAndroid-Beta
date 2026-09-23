package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qp implements Runnable {
    public final int f36524a;
    public final rp f36525b;
    public final String f36526c;

    public qp(rp rpVar, String str, int i10) {
        this.f36524a = i10;
        this.f36525b = rpVar;
        this.f36526c = str;
    }

    @Override
    public final void run() {
        switch (this.f36524a) {
            case 0:
                rp rpVar = this.f36525b;
                String str = this.f36526c;
                rpVar.getClass();
                AndroidUtilities.runOnUIThread(new qp(rpVar, str, 1));
                return;
            default:
                rp rpVar2 = this.f36525b;
                String str2 = this.f36526c;
                rpVar2.f36905f = null;
                Utilities.searchQueue.postRunnable(new r1(rpVar2, str2, new ArrayList(rpVar2.h.v), 28));
                return;
        }
    }
}
