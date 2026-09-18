package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class up implements Runnable {
    public final int f38109a;
    public final vp f38110b;
    public final String f38111c;

    public up(vp vpVar, String str, int i10) {
        this.f38109a = i10;
        this.f38110b = vpVar;
        this.f38111c = str;
    }

    @Override
    public final void run() {
        switch (this.f38109a) {
            case 0:
                vp vpVar = this.f38110b;
                String str = this.f38111c;
                vpVar.getClass();
                AndroidUtilities.runOnUIThread(new up(vpVar, str, 1));
                return;
            default:
                vp vpVar2 = this.f38110b;
                String str2 = this.f38111c;
                vpVar2.f38489f = null;
                Utilities.searchQueue.postRunnable(new q1(vpVar2, str2, new ArrayList(vpVar2.h.v), 28));
                return;
        }
    }
}
