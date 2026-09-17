package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class up implements Runnable {
    public final int f38104a;
    public final vp f38105b;
    public final String f38106c;

    public up(vp vpVar, String str, int i10) {
        this.f38104a = i10;
        this.f38105b = vpVar;
        this.f38106c = str;
    }

    @Override
    public final void run() {
        switch (this.f38104a) {
            case 0:
                vp vpVar = this.f38105b;
                String str = this.f38106c;
                vpVar.getClass();
                AndroidUtilities.runOnUIThread(new up(vpVar, str, 1));
                return;
            default:
                vp vpVar2 = this.f38105b;
                String str2 = this.f38106c;
                vpVar2.f38484f = null;
                Utilities.searchQueue.postRunnable(new q1(vpVar2, str2, new ArrayList(vpVar2.h.v), 28));
                return;
        }
    }
}
