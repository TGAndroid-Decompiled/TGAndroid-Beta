package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class tb implements Runnable {
    public final int f42940a;
    public final xb f42941b;

    public tb(xb xbVar, int i9) {
        this.f42940a = i9;
        this.f42941b = xbVar;
    }

    @Override
    public final void run() {
        switch (this.f42940a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                xb xbVar = this.f42941b;
                xbVar.a(countDownLatch, null);
                xbVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new tb(xbVar, 3));
                return;
            case 1:
                xb xbVar2 = this.f42941b;
                xbVar2.D = false;
                xbVar2.d(true);
                return;
            case 2:
                xb xbVar3 = this.f42941b;
                xbVar3.D = false;
                xbVar3.d(true);
                return;
            default:
                xb xbVar4 = this.f42941b;
                xbVar4.D = false;
                xbVar4.d(true);
                return;
        }
    }
}
