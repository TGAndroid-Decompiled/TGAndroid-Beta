package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class up implements Runnable {
    public final int f38060a;
    public final vp f38061b;
    public final String f38062c;

    public up(vp vpVar, String str, int i10) {
        this.f38060a = i10;
        this.f38061b = vpVar;
        this.f38062c = str;
    }

    @Override
    public final void run() {
        switch (this.f38060a) {
            case 0:
                vp vpVar = this.f38061b;
                String str = this.f38062c;
                vpVar.getClass();
                AndroidUtilities.runOnUIThread(new up(vpVar, str, 1));
                return;
            default:
                vp vpVar2 = this.f38061b;
                String str2 = this.f38062c;
                vpVar2.f38662f = null;
                Utilities.searchQueue.postRunnable(new q1(vpVar2, str2, new ArrayList(vpVar2.h.v), 28));
                return;
        }
    }
}
