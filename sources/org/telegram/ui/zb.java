package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class zb implements Runnable {
    public final int f43736a;
    public final dc f43737b;

    public zb(dc dcVar, int i10) {
        this.f43736a = i10;
        this.f43737b = dcVar;
    }

    @Override
    public final void run() {
        switch (this.f43736a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                dc dcVar = this.f43737b;
                dcVar.a(countDownLatch, null);
                dcVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new zb(dcVar, 3));
                return;
            case 1:
                dc dcVar2 = this.f43737b;
                dcVar2.G = false;
                dcVar2.d(true);
                return;
            case 2:
                dc dcVar3 = this.f43737b;
                dcVar3.G = false;
                dcVar3.d(true);
                return;
            default:
                dc dcVar4 = this.f43737b;
                dcVar4.G = false;
                dcVar4.d(true);
                return;
        }
    }
}
