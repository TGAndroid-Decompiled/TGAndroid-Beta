package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class xb implements Runnable {
    public final int f39880a;
    public final bc f39881b;

    public xb(bc bcVar, int i10) {
        this.f39880a = i10;
        this.f39881b = bcVar;
    }

    @Override
    public final void run() {
        switch (this.f39880a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                bc bcVar = this.f39881b;
                bcVar.a(countDownLatch, null);
                bcVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new xb(bcVar, 3));
                return;
            case 1:
                bc bcVar2 = this.f39881b;
                bcVar2.H = false;
                bcVar2.d(true);
                return;
            case 2:
                bc bcVar3 = this.f39881b;
                bcVar3.H = false;
                bcVar3.d(true);
                return;
            default:
                bc bcVar4 = this.f39881b;
                bcVar4.H = false;
                bcVar4.d(true);
                return;
        }
    }
}
