package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class zb implements Runnable {
    public final int f46244a;
    public final dc f46245b;

    public zb(dc dcVar, int i10) {
        this.f46244a = i10;
        this.f46245b = dcVar;
    }

    @Override
    public final void run() {
        switch (this.f46244a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                dc dcVar = this.f46245b;
                dcVar.a(countDownLatch, null);
                dcVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new zb(dcVar, 3));
                return;
            case 1:
                dc dcVar2 = this.f46245b;
                dcVar2.G = false;
                dcVar2.d(true);
                return;
            case 2:
                dc dcVar3 = this.f46245b;
                dcVar3.G = false;
                dcVar3.d(true);
                return;
            default:
                dc dcVar4 = this.f46245b;
                dcVar4.G = false;
                dcVar4.d(true);
                return;
        }
    }
}
