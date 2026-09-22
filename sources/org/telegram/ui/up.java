package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class up implements Runnable {
    public final int f38074a;
    public final vp f38075b;
    public final String f38076c;

    public up(vp vpVar, String str, int i10) {
        this.f38074a = i10;
        this.f38075b = vpVar;
        this.f38076c = str;
    }

    @Override
    public final void run() {
        switch (this.f38074a) {
            case 0:
                vp vpVar = this.f38075b;
                String str = this.f38076c;
                vpVar.getClass();
                AndroidUtilities.runOnUIThread(new up(vpVar, str, 1));
                return;
            default:
                vp vpVar2 = this.f38075b;
                String str2 = this.f38076c;
                vpVar2.f38598f = null;
                Utilities.searchQueue.postRunnable(new q1(vpVar2, str2, new ArrayList(vpVar2.h.v), 28));
                return;
        }
    }
}
