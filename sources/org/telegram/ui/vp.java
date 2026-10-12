package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vp implements Runnable {
    public final int f42818a;
    public final wp f42819b;
    public final String f42820c;

    public vp(wp wpVar, String str, int i10) {
        this.f42818a = i10;
        this.f42819b = wpVar;
        this.f42820c = str;
    }

    @Override
    public final void run() {
        switch (this.f42818a) {
            case 0:
                wp wpVar = this.f42819b;
                String str = this.f42820c;
                wpVar.getClass();
                AndroidUtilities.runOnUIThread(new vp(wpVar, str, 1));
                return;
            default:
                wp wpVar2 = this.f42819b;
                String str2 = this.f42820c;
                wpVar2.f43575f = null;
                Utilities.searchQueue.postRunnable(new r1(wpVar2, str2, new ArrayList(wpVar2.h.v), 28));
                return;
        }
    }
}
