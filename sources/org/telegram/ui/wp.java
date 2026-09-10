package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class wp implements Runnable {
    public final int f38295a;
    public final xp f38296b;
    public final String f38297c;

    public wp(xp xpVar, String str, int i10) {
        this.f38295a = i10;
        this.f38296b = xpVar;
        this.f38297c = str;
    }

    @Override
    public final void run() {
        switch (this.f38295a) {
            case 0:
                xp xpVar = this.f38296b;
                String str = this.f38297c;
                xpVar.getClass();
                AndroidUtilities.runOnUIThread(new wp(xpVar, str, 1));
                return;
            default:
                xp xpVar2 = this.f38296b;
                String str2 = this.f38297c;
                xpVar2.f38788f = null;
                Utilities.searchQueue.postRunnable(new s1(xpVar2, str2, new ArrayList(xpVar2.h.v), 28));
                return;
        }
    }
}
