package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class yp implements Runnable {
    public final int f42202a;
    public final zp f42203b;
    public final String f42204c;

    public yp(zp zpVar, String str, int i10) {
        this.f42202a = i10;
        this.f42203b = zpVar;
        this.f42204c = str;
    }

    @Override
    public final void run() {
        switch (this.f42202a) {
            case 0:
                zp zpVar = this.f42203b;
                String str = this.f42204c;
                zpVar.getClass();
                AndroidUtilities.runOnUIThread(new yp(zpVar, str, 1));
                return;
            default:
                zp zpVar2 = this.f42203b;
                String str2 = this.f42204c;
                zpVar2.f42691f = null;
                Utilities.searchQueue.postRunnable(new t1(zpVar2, str2, new ArrayList(zpVar2.h.v), 28));
                return;
        }
    }
}
