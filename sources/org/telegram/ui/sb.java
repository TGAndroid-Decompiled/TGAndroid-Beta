package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class sb implements Runnable {
    public final int f42339a;
    public final wb f42340b;

    public sb(wb wbVar, int i10) {
        this.f42339a = i10;
        this.f42340b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f42339a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                wb wbVar = this.f42340b;
                wbVar.a(countDownLatch, null);
                wbVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new sb(wbVar, 3));
                return;
            case 1:
                wb wbVar2 = this.f42340b;
                wbVar2.D = false;
                wbVar2.d(true);
                return;
            case 2:
                wb wbVar3 = this.f42340b;
                wbVar3.D = false;
                wbVar3.d(true);
                return;
            default:
                wb wbVar4 = this.f42340b;
                wbVar4.D = false;
                wbVar4.d(true);
                return;
        }
    }
}
