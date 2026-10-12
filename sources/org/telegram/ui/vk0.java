package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vk0 implements Runnable {
    public final int f41025a;
    public final wk0 f41026b;
    public final String f41027c;

    public vk0(wk0 wk0Var, String str, int i10) {
        this.f41025a = i10;
        this.f41026b = wk0Var;
        this.f41027c = str;
    }

    @Override
    public final void run() {
        switch (this.f41025a) {
            case 0:
                wk0 wk0Var = this.f41026b;
                String str = this.f41027c;
                wk0Var.getClass();
                AndroidUtilities.runOnUIThread(new vk0(wk0Var, str, 1));
                return;
            default:
                wk0 wk0Var2 = this.f41026b;
                String str2 = this.f41027c;
                hg.a2 a2Var = wk0Var2.h;
                int i10 = wk0Var2.f41614n.f32159s;
                boolean z10 = true;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new uf0(wk0Var2, str2, new ArrayList(wk0Var2.f41614n.f32160w), 8));
                return;
        }
    }
}
