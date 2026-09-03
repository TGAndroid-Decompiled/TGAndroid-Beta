package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class yb implements Runnable {
    public final int f40219a;
    public final cc f40220b;

    public yb(cc ccVar, int i10) {
        this.f40219a = i10;
        this.f40220b = ccVar;
    }

    @Override
    public final void run() {
        switch (this.f40219a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                cc ccVar = this.f40220b;
                ccVar.a(countDownLatch, null);
                ccVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new yb(ccVar, 3));
                return;
            case 1:
                cc ccVar2 = this.f40220b;
                ccVar2.E = false;
                ccVar2.d(true);
                return;
            case 2:
                cc ccVar3 = this.f40220b;
                ccVar3.E = false;
                ccVar3.d(true);
                return;
            default:
                cc ccVar4 = this.f40220b;
                ccVar4.E = false;
                ccVar4.d(true);
                return;
        }
    }
}
