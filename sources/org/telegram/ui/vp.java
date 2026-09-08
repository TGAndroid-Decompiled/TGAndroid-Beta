package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vp implements Runnable {
    public final int f41622a;
    public final wp f41623b;
    public final String f41624c;

    public vp(wp wpVar, String str, int i10) {
        this.f41622a = i10;
        this.f41623b = wpVar;
        this.f41624c = str;
    }

    @Override
    public final void run() {
        switch (this.f41622a) {
            case 0:
                wp wpVar = this.f41623b;
                String str = this.f41624c;
                wpVar.getClass();
                AndroidUtilities.runOnUIThread(new vp(wpVar, str, 1));
                return;
            default:
                wp wpVar2 = this.f41623b;
                String str2 = this.f41624c;
                wpVar2.f42474f = null;
                Utilities.searchQueue.postRunnable(new r1(wpVar2, str2, new ArrayList(wpVar2.h.v), 28));
                return;
        }
    }
}
