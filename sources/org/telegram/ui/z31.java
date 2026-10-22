package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class z31 implements Runnable {
    public final int f43623a;
    public final x51 f43624b;

    public z31(x51 x51Var, int i10) {
        this.f43623a = i10;
        this.f43624b = x51Var;
    }

    @Override
    public final void run() {
        switch (this.f43623a) {
            case 0:
                x51 x51Var = this.f43624b;
                x51Var.getClass();
                HashSet hashSet = ah.x0.f900a;
                hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f11785b == null) {
                    cacheOutQueue.f11785b = new CountDownLatch(1);
                }
                ah.x0.f901b = true;
                ah.x0.e = false;
                ah.x0.f904g = false;
                AndroidUtilities.runOnUIThread(new z31(x51Var, 2), 0L);
                return;
            case 1:
                x51 x51Var2 = this.f43624b;
                ArrayList arrayList = x51Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = x51Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = x51Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                x51Var2.f43081q0.E(true);
                return;
            case 2:
                this.f43624b.U1.start();
                return;
            case 3:
                this.f43624b.B(true, true, true);
                return;
            default:
                x51 x51Var3 = this.f43624b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                z31 z31Var = x51Var3.R1;
                globalInstance.removeDelayed(z31Var);
                NotificationCenter.getGlobalInstance().doOnIdle(z31Var);
                return;
        }
    }
}
