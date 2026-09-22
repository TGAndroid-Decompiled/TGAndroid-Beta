package org.telegram.ui;

import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
public final class zb implements Runnable {
    public final int f40177a;
    public final dc f40178b;

    public zb(dc dcVar, int i10) {
        this.f40177a = i10;
        this.f40178b = dcVar;
    }

    @Override
    public final void run() {
        switch (this.f40177a) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                dc dcVar = this.f40178b;
                dcVar.a(countDownLatch, null);
                dcVar.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                AndroidUtilities.runOnUIThread(new zb(dcVar, 3));
                return;
            case 1:
                dc dcVar2 = this.f40178b;
                dcVar2.H = false;
                dcVar2.d(true);
                return;
            case 2:
                dc dcVar3 = this.f40178b;
                dcVar3.H = false;
                dcVar3.d(true);
                return;
            default:
                dc dcVar4 = this.f40178b;
                dcVar4.H = false;
                dcVar4.d(true);
                return;
        }
    }
}
