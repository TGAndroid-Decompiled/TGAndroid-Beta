package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vp implements Runnable {
    public final int f41595a;
    public final wp f41596b;
    public final String f41597c;

    public vp(wp wpVar, String str, int i10) {
        this.f41595a = i10;
        this.f41596b = wpVar;
        this.f41597c = str;
    }

    @Override
    public final void run() {
        switch (this.f41595a) {
            case 0:
                wp wpVar = this.f41596b;
                String str = this.f41597c;
                wpVar.getClass();
                AndroidUtilities.runOnUIThread(new vp(wpVar, str, 1));
                return;
            default:
                wp wpVar2 = this.f41596b;
                String str2 = this.f41597c;
                wpVar2.f42447f = null;
                Utilities.searchQueue.postRunnable(new r1(wpVar2, str2, new ArrayList(wpVar2.h.v), 28));
                return;
        }
    }
}
