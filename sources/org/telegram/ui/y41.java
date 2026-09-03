package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class y41 implements Runnable {
    public final int f40139a;
    public final x61 f40140b;

    public y41(x61 x61Var, int i10) {
        this.f40139a = i10;
        this.f40140b = x61Var;
    }

    @Override
    public final void run() {
        switch (this.f40139a) {
            case 0:
                x61 x61Var = this.f40140b;
                x61Var.getClass();
                HashSet hashSet = mg.g0.f13991a;
                re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f43470b == null) {
                    cacheOutQueue.f43470b = new CountDownLatch(1);
                }
                mg.g0.f13992b = true;
                mg.g0.e = false;
                mg.g0.f13995g = false;
                AndroidUtilities.runOnUIThread(new y41(x61Var, 2), 0L);
                return;
            case 1:
                x61 x61Var2 = this.f40140b;
                ArrayList arrayList = x61Var2.f39905x1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = x61Var2.f39908y1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = x61Var2.A1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                x61Var2.f39880n0.E(true);
                return;
            case 2:
                this.f40140b.R1.start();
                return;
            case 3:
                this.f40140b.B(true, true, true);
                return;
            default:
                x61 x61Var3 = this.f40140b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                y41 y41Var = x61Var3.O1;
                globalInstance.removeDelayed(y41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(y41Var);
                return;
        }
    }
}
