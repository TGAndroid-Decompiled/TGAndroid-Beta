package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class wb implements Runnable {
    public final int f39387a;
    public final bc f39388b;

    public wb(bc bcVar, int i10) {
        this.f39387a = i10;
        this.f39388b = bcVar;
    }

    @Override
    public final void run() {
        switch (this.f39387a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                bc bcVar = this.f39388b;
                bcVar.a(countDownLatch, null);
                bcVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new wb(bcVar, 3));
                return;
            case 1:
                bc bcVar2 = this.f39388b;
                bcVar2.E = false;
                bcVar2.d(true);
                return;
            case 2:
                bc bcVar3 = this.f39388b;
                bcVar3.E = false;
                bcVar3.d(true);
                return;
            default:
                bc bcVar4 = this.f39388b;
                bcVar4.E = false;
                bcVar4.d(true);
                return;
        }
    }
}
