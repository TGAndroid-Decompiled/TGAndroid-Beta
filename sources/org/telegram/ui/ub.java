package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;

public final class ub implements Runnable {

    public final int f43176a;

    public final yb f43177b;

    public ub(yb ybVar, int i10) {
        this.f43176a = i10;
        this.f43177b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f43176a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                yb ybVar = this.f43177b;
                ybVar.a(countDownLatch, null);
                ybVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                    break;
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new ub(ybVar, 3));
                break;
            case 1:
                yb ybVar2 = this.f43177b;
                ybVar2.D = false;
                ybVar2.d(true);
                break;
            case 2:
                yb ybVar3 = this.f43177b;
                ybVar3.D = false;
                ybVar3.d(true);
                break;
            default:
                yb ybVar4 = this.f43177b;
                ybVar4.D = false;
                ybVar4.d(true);
                break;
        }
    }
}
