package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vp implements Runnable {
    public final int f41623a;
    public final wp f41624b;
    public final String f41625c;

    public vp(wp wpVar, String str, int i10) {
        this.f41623a = i10;
        this.f41624b = wpVar;
        this.f41625c = str;
    }

    @Override
    public final void run() {
        switch (this.f41623a) {
            case 0:
                wp wpVar = this.f41624b;
                String str = this.f41625c;
                wpVar.getClass();
                AndroidUtilities.runOnUIThread(new vp(wpVar, str, 1));
                return;
            default:
                wp wpVar2 = this.f41624b;
                String str2 = this.f41625c;
                wpVar2.f42475f = null;
                Utilities.searchQueue.postRunnable(new r1(wpVar2, str2, new ArrayList(wpVar2.h.v), 28));
                return;
        }
    }
}
