package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class rp implements Runnable {
    public final int f40174a;
    public final sp f40175b;
    public final String f40176c;

    public rp(sp spVar, String str, int i10) {
        this.f40174a = i10;
        this.f40175b = spVar;
        this.f40176c = str;
    }

    @Override
    public final void run() {
        switch (this.f40174a) {
            case 0:
                sp spVar = this.f40175b;
                String str = this.f40176c;
                spVar.getClass();
                AndroidUtilities.runOnUIThread(new rp(spVar, str, 1));
                return;
            default:
                sp spVar2 = this.f40175b;
                String str2 = this.f40176c;
                spVar2.f40590f = null;
                Utilities.searchQueue.postRunnable(new r1(spVar2, str2, new ArrayList(spVar2.h.v), 28));
                return;
        }
    }
}
