package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class uk0 implements Runnable {
    public final int f40423a;
    public final vk0 f40424b;
    public final String f40425c;

    public uk0(vk0 vk0Var, String str, int i10) {
        this.f40423a = i10;
        this.f40424b = vk0Var;
        this.f40425c = str;
    }

    @Override
    public final void run() {
        switch (this.f40423a) {
            case 0:
                vk0 vk0Var = this.f40424b;
                String str = this.f40425c;
                vk0Var.getClass();
                AndroidUtilities.runOnUIThread(new uk0(vk0Var, str, 1));
                return;
            default:
                vk0 vk0Var2 = this.f40424b;
                String str2 = this.f40425c;
                hg.a2 a2Var = vk0Var2.h;
                int i10 = vk0Var2.f40726n.f31861s;
                boolean z10 = true;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new tf0(vk0Var2, str2, new ArrayList(vk0Var2.f40726n.f31862w), 8));
                return;
        }
    }
}
