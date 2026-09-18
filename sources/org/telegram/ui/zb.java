package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class zb implements Runnable {
    public final int f40067a;
    public final dc f40068b;

    public zb(dc dcVar, int i10) {
        this.f40067a = i10;
        this.f40068b = dcVar;
    }

    @Override
    public final void run() {
        switch (this.f40067a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                dc dcVar = this.f40068b;
                dcVar.a(countDownLatch, null);
                dcVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new zb(dcVar, 3));
                return;
            case 1:
                dc dcVar2 = this.f40068b;
                dcVar2.H = false;
                dcVar2.d(true);
                return;
            case 2:
                dc dcVar3 = this.f40068b;
                dcVar3.H = false;
                dcVar3.d(true);
                return;
            default:
                dc dcVar4 = this.f40068b;
                dcVar4.H = false;
                dcVar4.d(true);
                return;
        }
    }
}
