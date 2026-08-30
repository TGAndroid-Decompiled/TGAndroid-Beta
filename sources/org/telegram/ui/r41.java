package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class r41 implements Runnable {
    public final int f37918a;
    public final q61 f37919b;

    public r41(q61 q61Var, int i10) {
        this.f37918a = i10;
        this.f37919b = q61Var;
    }

    @Override
    public final void run() {
        switch (this.f37918a) {
            case 0:
                q61 q61Var = this.f37919b;
                q61Var.getClass();
                HashSet hashSet = mg.g0.f14003a;
                re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f43446b == null) {
                    cacheOutQueue.f43446b = new CountDownLatch(1);
                }
                mg.g0.f14004b = true;
                mg.g0.e = false;
                mg.g0.f14007g = false;
                AndroidUtilities.runOnUIThread(new r41(q61Var, 2), 0L);
                return;
            case 1:
                q61 q61Var2 = this.f37919b;
                ArrayList arrayList = q61Var2.f37648x1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = q61Var2.f37651y1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = q61Var2.A1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                q61Var2.f37623n0.E(true);
                return;
            case 2:
                this.f37919b.R1.start();
                return;
            case 3:
                this.f37919b.B(true, true, true);
                return;
            default:
                q61 q61Var3 = this.f37919b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                r41 r41Var = q61Var3.O1;
                globalInstance.removeDelayed(r41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(r41Var);
                return;
        }
    }
}
