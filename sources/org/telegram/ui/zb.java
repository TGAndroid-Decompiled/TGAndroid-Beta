package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class zb implements Runnable {
    public final int f40457a;
    public final dc f40458b;

    public zb(dc dcVar, int i10) {
        this.f40457a = i10;
        this.f40458b = dcVar;
    }

    @Override
    public final void run() {
        switch (this.f40457a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                dc dcVar = this.f40458b;
                dcVar.a(countDownLatch, null);
                dcVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new zb(dcVar, 3));
                return;
            case 1:
                dc dcVar2 = this.f40458b;
                dcVar2.G = false;
                dcVar2.d(true);
                return;
            case 2:
                dc dcVar3 = this.f40458b;
                dcVar3.G = false;
                dcVar3.d(true);
                return;
            default:
                dc dcVar4 = this.f40458b;
                dcVar4.G = false;
                dcVar4.d(true);
                return;
        }
    }
}
