package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vp implements Runnable {
    public final int f41596a;
    public final wp f41597b;
    public final String f41598c;

    public vp(wp wpVar, String str, int i10) {
        this.f41596a = i10;
        this.f41597b = wpVar;
        this.f41598c = str;
    }

    @Override
    public final void run() {
        switch (this.f41596a) {
            case 0:
                wp wpVar = this.f41597b;
                String str = this.f41598c;
                wpVar.getClass();
                AndroidUtilities.runOnUIThread(new vp(wpVar, str, 1));
                return;
            default:
                wp wpVar2 = this.f41597b;
                String str2 = this.f41598c;
                wpVar2.f42448f = null;
                Utilities.searchQueue.postRunnable(new r1(wpVar2, str2, new ArrayList(wpVar2.h.v), 28));
                return;
        }
    }
}
