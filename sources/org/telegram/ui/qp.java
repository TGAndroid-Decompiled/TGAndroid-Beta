package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qp implements Runnable {
    public final int f36784a;
    public final rp f36785b;
    public final String f36786c;

    public qp(rp rpVar, String str, int i10) {
        this.f36784a = i10;
        this.f36785b = rpVar;
        this.f36786c = str;
    }

    @Override
    public final void run() {
        switch (this.f36784a) {
            case 0:
                rp rpVar = this.f36785b;
                String str = this.f36786c;
                rpVar.getClass();
                AndroidUtilities.runOnUIThread(new qp(rpVar, str, 1));
                return;
            default:
                rp rpVar2 = this.f36785b;
                String str2 = this.f36786c;
                rpVar2.f37209f = null;
                Utilities.searchQueue.postRunnable(new s1(rpVar2, str2, new ArrayList(rpVar2.h.v), 28));
                return;
        }
    }
}
