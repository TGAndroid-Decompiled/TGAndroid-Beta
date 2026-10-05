package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class rp implements Runnable {
    public final int f40149a;
    public final sp f40150b;
    public final String f40151c;

    public rp(sp spVar, String str, int i10) {
        this.f40149a = i10;
        this.f40150b = spVar;
        this.f40151c = str;
    }

    @Override
    public final void run() {
        switch (this.f40149a) {
            case 0:
                sp spVar = this.f40150b;
                String str = this.f40151c;
                spVar.getClass();
                AndroidUtilities.runOnUIThread(new rp(spVar, str, 1));
                return;
            default:
                sp spVar2 = this.f40150b;
                String str2 = this.f40151c;
                spVar2.f40602f = null;
                Utilities.searchQueue.postRunnable(new r1(spVar2, str2, new ArrayList(spVar2.h.v), 28));
                return;
        }
    }
}
