package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qp implements Runnable {
    public final int f37448a;
    public final rp f37449b;
    public final String f37450c;

    public qp(rp rpVar, String str, int i10) {
        this.f37448a = i10;
        this.f37449b = rpVar;
        this.f37450c = str;
    }

    @Override
    public final void run() {
        switch (this.f37448a) {
            case 0:
                rp rpVar = this.f37449b;
                String str = this.f37450c;
                rpVar.getClass();
                AndroidUtilities.runOnUIThread(new qp(rpVar, str, 1));
                return;
            default:
                rp rpVar2 = this.f37449b;
                String str2 = this.f37450c;
                rpVar2.f37937f = null;
                Utilities.searchQueue.postRunnable(new u1(rpVar2, str2, new ArrayList(rpVar2.h.v), 28));
                return;
        }
    }
}
