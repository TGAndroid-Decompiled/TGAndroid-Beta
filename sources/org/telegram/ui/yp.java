package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class yp implements Runnable {
    public final int f41857a;
    public final zp f41858b;
    public final String f41859c;

    public yp(zp zpVar, String str, int i10) {
        this.f41857a = i10;
        this.f41858b = zpVar;
        this.f41859c = str;
    }

    @Override
    public final void run() {
        switch (this.f41857a) {
            case 0:
                zp zpVar = this.f41858b;
                String str = this.f41859c;
                zpVar.getClass();
                AndroidUtilities.runOnUIThread(new yp(zpVar, str, 1));
                return;
            default:
                zp zpVar2 = this.f41858b;
                String str2 = this.f41859c;
                zpVar2.f42399f = null;
                Utilities.searchQueue.postRunnable(new t1(zpVar2, str2, new ArrayList(zpVar2.h.v), 28));
                return;
        }
    }
}
