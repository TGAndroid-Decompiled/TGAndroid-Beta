package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class yb implements Runnable {
    public final int f44305a;
    public final cc f44306b;

    public yb(cc ccVar, int i10) {
        this.f44305a = i10;
        this.f44306b = ccVar;
    }

    @Override
    public final void run() {
        switch (this.f44305a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                cc ccVar = this.f44306b;
                ccVar.a(countDownLatch, null);
                ccVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new yb(ccVar, 3));
                return;
            case 1:
                cc ccVar2 = this.f44306b;
                ccVar2.H = false;
                ccVar2.d(true);
                return;
            case 2:
                cc ccVar3 = this.f44306b;
                ccVar3.H = false;
                ccVar3.d(true);
                return;
            default:
                cc ccVar4 = this.f44306b;
                ccVar4.H = false;
                ccVar4.d(true);
                return;
        }
    }
}
