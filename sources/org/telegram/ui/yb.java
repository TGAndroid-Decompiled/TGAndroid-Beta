package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class yb implements Runnable {
    public final int f43096a;
    public final cc f43097b;

    public yb(cc ccVar, int i10) {
        this.f43096a = i10;
        this.f43097b = ccVar;
    }

    @Override
    public final void run() {
        switch (this.f43096a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                cc ccVar = this.f43097b;
                ccVar.a(countDownLatch, null);
                ccVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new yb(ccVar, 3));
                return;
            case 1:
                cc ccVar2 = this.f43097b;
                ccVar2.H = false;
                ccVar2.d(true);
                return;
            case 2:
                cc ccVar3 = this.f43097b;
                ccVar3.H = false;
                ccVar3.d(true);
                return;
            default:
                cc ccVar4 = this.f43097b;
                ccVar4.H = false;
                ccVar4.d(true);
                return;
        }
    }
}
