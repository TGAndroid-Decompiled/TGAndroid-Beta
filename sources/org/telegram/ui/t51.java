package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class t51 implements Runnable {
    public final int f40293a;
    public final r71 f40294b;

    public t51(r71 r71Var, int i10) {
        this.f40293a = i10;
        this.f40294b = r71Var;
    }

    @Override
    public final void run() {
        switch (this.f40293a) {
            case 0:
                r71 r71Var = this.f40294b;
                r71Var.getClass();
                HashSet hashSet = ah.x0.f896a;
                hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f10477b == null) {
                    cacheOutQueue.f10477b = new CountDownLatch(1);
                }
                ah.x0.f897b = true;
                ah.x0.e = false;
                ah.x0.f900g = false;
                AndroidUtilities.runOnUIThread(new t51(r71Var, 2), 0L);
                return;
            case 1:
                r71 r71Var2 = this.f40294b;
                ArrayList arrayList = r71Var2.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = r71Var2.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = r71Var2.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                r71Var2.f39654q0.E(true);
                return;
            case 2:
                this.f40294b.U1.start();
                return;
            case 3:
                this.f40294b.B(true, true, true);
                return;
            default:
                r71 r71Var3 = this.f40294b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                t51 t51Var = r71Var3.R1;
                globalInstance.removeDelayed(t51Var);
                NotificationCenter.getGlobalInstance().doOnIdle(t51Var);
                return;
        }
    }
}
