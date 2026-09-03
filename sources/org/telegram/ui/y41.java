package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class y41 implements Runnable {
    public final int f43538a;
    public final w61 f43539b;

    public y41(w61 w61Var, int i10) {
        this.f43538a = i10;
        this.f43539b = w61Var;
    }

    @Override
    public final void run() {
        switch (this.f43538a) {
            case 0:
                w61 w61Var = this.f43539b;
                w61Var.getClass();
                HashSet hashSet = ng.g0.f16069a;
                re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f46833b == null) {
                    cacheOutQueue.f46833b = new CountDownLatch(1);
                }
                ng.g0.f16070b = true;
                ng.g0.f16072e = false;
                ng.g0.f16074g = false;
                AndroidUtilities.runOnUIThread(new y41(w61Var, 2), 0L);
                return;
            case 1:
                w61 w61Var2 = this.f43539b;
                ArrayList arrayList = w61Var2.f42357x1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = w61Var2.f42360y1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = w61Var2.A1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                w61Var2.f42332n0.E(true);
                return;
            case 2:
                this.f43539b.R1.start();
                return;
            case 3:
                this.f43539b.B(true, true, true);
                return;
            default:
                w61 w61Var3 = this.f43539b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                y41 y41Var = w61Var3.O1;
                globalInstance.removeDelayed(y41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(y41Var);
                return;
        }
    }
}
