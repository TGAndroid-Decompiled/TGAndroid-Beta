package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class wb implements Runnable {
    public final int f42399a;
    public final ac f42400b;

    public wb(ac acVar, int i10) {
        this.f42399a = i10;
        this.f42400b = acVar;
    }

    @Override
    public final void run() {
        switch (this.f42399a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                ac acVar = this.f42400b;
                acVar.a(countDownLatch, null);
                acVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new wb(acVar, 3));
                return;
            case 1:
                ac acVar2 = this.f42400b;
                acVar2.E = false;
                acVar2.d(true);
                return;
            case 2:
                ac acVar3 = this.f42400b;
                acVar3.E = false;
                acVar3.d(true);
                return;
            default:
                ac acVar4 = this.f42400b;
                acVar4.E = false;
                acVar4.d(true);
                return;
        }
    }
}
