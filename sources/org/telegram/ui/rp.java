package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class rp implements Runnable {
    public final int f40169a;
    public final sp f40170b;
    public final String f40171c;

    public rp(sp spVar, String str, int i10) {
        this.f40169a = i10;
        this.f40170b = spVar;
        this.f40171c = str;
    }

    @Override
    public final void run() {
        switch (this.f40169a) {
            case 0:
                sp spVar = this.f40170b;
                String str = this.f40171c;
                spVar.getClass();
                AndroidUtilities.runOnUIThread(new rp(spVar, str, 1));
                return;
            default:
                sp spVar2 = this.f40170b;
                String str2 = this.f40171c;
                spVar2.f40584f = null;
                Utilities.searchQueue.postRunnable(new r1(spVar2, str2, new ArrayList(spVar2.h.v), 28));
                return;
        }
    }
}
