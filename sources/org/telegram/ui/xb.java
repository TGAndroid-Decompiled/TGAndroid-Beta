package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class xb implements Runnable {
    public final int f39895a;
    public final bc f39896b;

    public xb(bc bcVar, int i10) {
        this.f39895a = i10;
        this.f39896b = bcVar;
    }

    @Override
    public final void run() {
        switch (this.f39895a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                bc bcVar = this.f39896b;
                bcVar.a(countDownLatch, null);
                bcVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new xb(bcVar, 3));
                return;
            case 1:
                bc bcVar2 = this.f39896b;
                bcVar2.H = false;
                bcVar2.d(true);
                return;
            case 2:
                bc bcVar3 = this.f39896b;
                bcVar3.H = false;
                bcVar3.d(true);
                return;
            default:
                bc bcVar4 = this.f39896b;
                bcVar4.H = false;
                bcVar4.d(true);
                return;
        }
    }
}
