package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vp implements Runnable {
    public final int f42820a;
    public final wp f42821b;
    public final String f42822c;

    public vp(wp wpVar, String str, int i10) {
        this.f42820a = i10;
        this.f42821b = wpVar;
        this.f42822c = str;
    }

    @Override
    public final void run() {
        switch (this.f42820a) {
            case 0:
                wp wpVar = this.f42821b;
                String str = this.f42822c;
                wpVar.getClass();
                AndroidUtilities.runOnUIThread(new vp(wpVar, str, 1));
                return;
            default:
                wp wpVar2 = this.f42821b;
                String str2 = this.f42822c;
                wpVar2.f43580f = null;
                Utilities.searchQueue.postRunnable(new r1(wpVar2, str2, new ArrayList(wpVar2.h.v), 28));
                return;
        }
    }
}
