package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.NotificationCenter;
public final class t41 implements Runnable {
    public final int f41499a;
    public final r61 f41500b;

    public t41(r61 r61Var, int i10) {
        this.f41499a = i10;
        this.f41500b = r61Var;
    }

    @Override
    public final void run() {
        switch (this.f41499a) {
            case 0:
                r61 r61Var = this.f41500b;
                r61Var.getClass();
                HashSet hashSet = ng.g0.f16067a;
                re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                if (cacheOutQueue.f46802b == null) {
                    cacheOutQueue.f46802b = new CountDownLatch(1);
                }
                ng.g0.f16068b = true;
                ng.g0.f16070e = false;
                ng.g0.f16072g = false;
                AndroidUtilities.runOnUIThread(new t41(r61Var, 2), 0L);
                return;
            case 1:
                r61 r61Var2 = this.f41500b;
                ArrayList arrayList = r61Var2.f40834x1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = r61Var2.f40837y1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = r61Var2.A1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                r61Var2.f40809n0.E(true);
                return;
            case 2:
                this.f41500b.R1.start();
                return;
            case 3:
                this.f41500b.B(true, true, true);
                return;
            default:
                r61 r61Var3 = this.f41500b;
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                t41 t41Var = r61Var3.O1;
                globalInstance.removeDelayed(t41Var);
                NotificationCenter.getGlobalInstance().doOnIdle(t41Var);
                return;
        }
    }
}
